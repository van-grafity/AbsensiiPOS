package coding.vanlaban.android.mvpthree.Activities.Main;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import javax.inject.Inject;

import coding.vanlaban.android.mvpthree.Activities.Main.Dagger.DaggerMainComponent;
import coding.vanlaban.android.mvpthree.Activities.Main.Dagger.MainAppContextModule;
import coding.vanlaban.android.mvpthree.Application.Dagger.AppComponent;
import coding.vanlaban.android.mvpthree.Application.MyApplication;
import coding.vanlaban.android.mvpthree.Presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity {
    @Inject
    LoginPresenter presenter;
    View view;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //pattern Singleton
        AppComponent appComp=((MyApplication)getApplication()).getAppComponent();
        DaggerMainComponent.builder()
                .appComponent(appComp)
                .mainAppContextModule(new MainAppContextModule(this))
                .build()
                .inject(this);

        this.setContentView(presenter.constructView());

    }
}
