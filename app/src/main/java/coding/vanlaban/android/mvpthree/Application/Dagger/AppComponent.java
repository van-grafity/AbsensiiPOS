package coding.vanlaban.android.mvpthree.Application.Dagger;

import coding.vanlaban.android.mvpthree.Infrastruktur.Dagger.AccountApiModule;
import coding.vanlaban.android.mvpthree.Infrastruktur.Dagger.InfraModule;
import coding.vanlaban.android.mvpthree.Infrastruktur.Net.AccountApi;
import coding.vanlaban.android.mvpthree.Infrastruktur.UserStore;
import dagger.Component;

@Component(modules = {InfraModule.class, AccountApiModule.class})
public interface AppComponent {
    UserStore getUserStore();
    AccountApi getAccountApi();
}
