package coding.vanlaban.android.mvpthree.Application.Dagger;

import coding.vanlaban.android.mvpthree.Infrastruktur.Dagger.InfraModule;
import coding.vanlaban.android.mvpthree.Infrastruktur.UserStore;
import dagger.Component;

@Component(modules = {InfraModule.class})
public interface AppComponent {
    UserStore getUserStore();
}
