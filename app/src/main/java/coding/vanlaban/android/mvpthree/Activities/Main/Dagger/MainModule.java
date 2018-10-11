package coding.vanlaban.android.mvpthree.Activities.Main.Dagger;

import android.content.Context;

import coding.vanlaban.android.mvpthree.Infrastruktur.UserStore;
import coding.vanlaban.android.mvpthree.Presenter.LoginPresenter;
import coding.vanlaban.android.mvpthree.Presenter.LoginPresenterImpl;
import coding.vanlaban.android.mvpthree.View.DialogLoginView;
import coding.vanlaban.android.mvpthree.View.LoginView;
import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    @Provides
    @MainScope
    LoginPresenter provideLoginPresenter(Context context, LoginView loginView, UserStore userStore){
        return new LoginPresenterImpl(context, loginView, userStore);
    }
    @Provides
    @MainScope
    LoginView provideLoginView(Context context){
        return new DialogLoginView(context);
    }
}
