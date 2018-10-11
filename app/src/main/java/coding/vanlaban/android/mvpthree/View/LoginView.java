package coding.vanlaban.android.mvpthree.View;

import android.view.View;

import coding.vanlaban.android.mvpthree.Presenter.LoginPresenter;

public interface LoginView {
    void showValidationErrorMsg();
    void loginSuccessFully();
    void loginFail();
    View constructView();

    void setPresenter(LoginPresenter loginPresenter);
}
