package coding.vanlaban.android.mvpthree.Infrastruktur.Dagger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import coding.vanlaban.android.mvpthree.Infrastruktur.Net.AccountApi;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AccountApiModule {
    private static final String BASE_URL = "http://account-api.ipos.co.id";
    @Provides
    AccountApi provideRetrofitApiService(){
        Gson gson = new GsonBuilder().setDateFormat("EEE, dd MMM yyyy HH:mm:ss z").create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return  retrofit.create(AccountApi.class);
    }
}
