package coding.vanlaban.android.mvpthree.Activities.Two.Dagger;

import coding.vanlaban.android.mvpthree.Activities.Two.ActivityTwo;
import coding.vanlaban.android.mvpthree.Application.Dagger.AppComponent;
import dagger.Component;

@HomeScope
@Component (modules = {HomeModule.class, HomeContextModule.class},  dependencies = {AppComponent.class})
public interface HomeComponent {
    void inject(ActivityTwo activityTwo);
}
