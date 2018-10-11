package coding.vanlaban.android.mvpthree.Activities.Two.Dagger;

import android.content.Context;

import coding.vanlaban.android.mvpthree.Infrastruktur.UserStore;
import coding.vanlaban.android.mvpthree.Presenter.HomePresenter;
import coding.vanlaban.android.mvpthree.Presenter.HomePresenterImpl;
import coding.vanlaban.android.mvpthree.View.DialogHomeView;
import coding.vanlaban.android.mvpthree.View.HomeView;
import dagger.Module;
import dagger.Provides;

@Module
public class HomeModule {
    @Provides
    @HomeScope
    HomeView provideHomeView(Context context){
        return new DialogHomeView(context);
    }
    @Provides
    @HomeScope
    HomePresenter provideHomePresenter(HomeView homeView, UserStore store){
        return new HomePresenterImpl(homeView, store);
    }
}
