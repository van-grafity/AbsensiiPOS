package coding.vanlaban.android.mvpthree.Application;

import android.app.Application;

import coding.vanlaban.android.mvpthree.Application.Dagger.AppComponent;
import coding.vanlaban.android.mvpthree.Application.Dagger.DaggerAppComponent;


public class MyApplication extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {

        super.onCreate();
        appComponent=this.createAppComponent();
    }
    private AppComponent createAppComponent(){
        return DaggerAppComponent.create();
    }
    public AppComponent getAppComponent(){
        return appComponent;
    }
}