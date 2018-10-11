package coding.vanlaban.android.mvpthree.Infrastruktur.Dagger;

import coding.vanlaban.android.mvpthree.Infrastruktur.UserStore;
import coding.vanlaban.android.mvpthree.Infrastruktur.UserStoreAdapter;
import dagger.Module;
import dagger.Provides;

@Module
public class InfraModule {

    @Provides
    UserStore provideUserStoreAdapter(){
        return new UserStoreAdapter();
    }

}
