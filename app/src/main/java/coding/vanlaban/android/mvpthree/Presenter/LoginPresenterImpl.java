package coding.vanlaban.android.mvpthree.Presenter;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;

import coding.vanlaban.android.mvpthree.Activities.Two.ActivityTwo;
import coding.vanlaban.android.mvpthree.Infrastruktur.UserStore;
import coding.vanlaban.android.mvpthree.Model.User;
import coding.vanlaban.android.mvpthree.View.LoginView;

public class LoginPresenterImpl implements LoginPresenter{
    private LoginView loginView;
    private UserStore userStore;
    private Context context;
    public LoginPresenterImpl(Context context,LoginView loginView, UserStore userStore)
    {
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
            User user = userStore.findByName(username);
            if (user != null && user.validatePassword(password))
            {
                Intent intent = new Intent(context,ActivityTwo.class);
                context.startActivity(intent);

            }
            else{
                loginView.loginFail();
            }
        }
    }

    @Override
    public View constructView() {
        return loginView.constructView();
    }
}