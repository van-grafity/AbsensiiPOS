package coding.vanlaban.android.mvpthree.Activities.Main.Dagger;

import coding.vanlaban.android.mvpthree.Activities.Main.MainActivity;
import coding.vanlaban.android.mvpthree.Application.Dagger.AppComponent;
import dagger.Component;

@MainScope
@Component (modules = {MainAppContextModule.class,MainModule.class}, dependencies = {AppComponent.class})
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
