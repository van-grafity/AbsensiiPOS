package coding.vanlaban.android.mvpthree.Presenter;


import android.view.View;

public interface LoginPresenter {

    void handleLogin(String username, String password);
    View constructView();

}
