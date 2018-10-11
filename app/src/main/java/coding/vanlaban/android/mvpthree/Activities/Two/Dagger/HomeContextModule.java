package coding.vanlaban.android.mvpthree.Activities.Two.Dagger;

import android.content.Context;

import coding.vanlaban.android.mvpthree.Activities.Two.ActivityTwo;
import dagger.Module;
import dagger.Provides;

@Module
public class HomeContextModule {
    private final ActivityTwo activityTwo;

    public HomeContextModule(ActivityTwo activityTwo) {
        this.activityTwo = activityTwo;
    }

    @Provides
    @HomeScope
    Context provideHomeContext(){
        return activityTwo;
    }
}
