package coding.vanlaban.android.mvpthree.Activities.Main.Dagger;

import android.content.Context;

import coding.vanlaban.android.mvpthree.Activities.Main.MainActivity;
import dagger.Module;
import dagger.Provides;

@Module
public class MainAppContextModule {
    private final MainActivity context;

    public MainAppContextModule(MainActivity context) {
        this.context = context;
    }
    @Provides
    @MainScope
    Context provideContext(){
        return context;
    }
}
