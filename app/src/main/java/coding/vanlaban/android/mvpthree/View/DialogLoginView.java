package coding.vanlaban.android.mvpthree.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import coding.vanlaban.android.mvpthree.Presenter.LoginPresenter;
import coding.vanlaban.android.mvpthree.R;

public class DialogLoginView implements LoginView {
    @BindView(R.id.textViewUserName)
    TextView textViewUserName;
    @BindView(R.id.textViewPassword)
    EditText textViewPassword;
    @BindView(R.id.btnLogin)
    Button buttonLogin;
    @BindView(R.id.idTV)
    TextView idTV;

    private Context context;
    private View view;
    private LoginPresenter presenter;

    public DialogLoginView(Context context) {
        this.context = context;

        FrameLayout parent = new FrameLayout(context);
        parent.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        view = LayoutInflater.from(context).inflate(R.layout.activity_main, parent, true);
        ButterKnife.bind(this, view);
    }

    @Override
    public void showValidationErrorMsg() {

    }

    @Override
    public void loginSuccessFully() {
    }

    @Override
    @OnClick(R.id.idTV)
    public void loginFail() {
        ButterKnife.bind(view);
        //String showError = "Silahkan masukkan username dan password dengan benar";
        //idTV.setText(String.valueOf(showError));
        Toast.makeText(context,"username dan kata sandi anda salah",Toast.LENGTH_SHORT).show();
    }

    @Override
    public View constructView() {
        return this.view;
    }

    @Override
    public void setPresenter(LoginPresenter loginPresenter) {
        this.presenter = loginPresenter;
    }

    @OnClick(R.id.btnLogin)
    public void initializeView() {
        presenter.handleLogin(textViewUserName.getText().toString(), textViewPassword.getText().toString());
    }
}
