package coding.vanlaban.android.mvpthree.Presenter;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import coding.vanlaban.android.mvpthree.Activities.Two.ActivityTwo;
import coding.vanlaban.android.mvpthree.Infrastruktur.Net.AccountApi;
import coding.vanlaban.android.mvpthree.Infrastruktur.UserStore;
import coding.vanlaban.android.mvpthree.View.LoginView;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class LoginPresenterImpl implements LoginPresenter{
    private LoginView loginView;
    private UserStore userStore;
    private AccountApi accountApi;
    private Context context;
    public LoginPresenterImpl(Context context,LoginView loginView, UserStore userStore, AccountApi accountApi)
    {
        this.accountApi = accountApi;
        this.userStore = userStore;
        this.loginView = loginView;
        this.context=context;
        this.loginView.setPresenter(this);
    }
    @Override
    public void handleLogin(String username, String password)
    {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password))
        {
            loginView.showValidationErrorMsg();
        }
        else
        {
            this.accountApi

                .getToken(username,password,"password")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(token -> {Intent intent = new Intent(context,ActivityTwo.class);
                            context.startActivity(intent);
                        },

                        error-> {
                            String errorMessage="";
                            if (error instanceof HttpException){
                                ResponseBody body = ((HttpException) error).response().errorBody();
                                try {
                                    String json=body.string();
                                    JSONObject jsonObject=new JSONObject(json);
                                    errorMessage=jsonObject.getString("error");
                                } catch (JSONException |IOException e) {
                                    e.printStackTrace();
                                    errorMessage=e.getMessage();
                                }
                            }else{
                                errorMessage=error.getMessage();
                            }
                            Log.d("Test",errorMessage);
                            loginView.loginFail(errorMessage);
                        }
                );
        }
    }

    @Override
    public View constructView() {
        return loginView.constructView();
    }
}