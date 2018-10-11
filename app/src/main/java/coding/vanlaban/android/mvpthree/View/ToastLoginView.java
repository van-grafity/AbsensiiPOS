package coding.vanlaban.android.mvpthree.View;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import coding.vanlaban.android.mvpthree.Presenter.LoginPresenter;

public class ToastLoginView implements LoginView {
    private Context loginContext;
    public ToastLoginView(Context context){
        loginContext=context;
    }
    @Override
    public void showValidationErrorMsg()
    {
        Toast.makeText(loginContext, "Username or Password is incorrect", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void loginSuccessFully()
    {
        Toast.makeText(loginContext, "Login SuccessFully", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void loginFail()
    {
        Toast.makeText(loginContext, "Something went wrong", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View constructView() {
        return null;
    }

    @Override
    public void setPresenter(LoginPresenter loginPresenter) {

    }

}
