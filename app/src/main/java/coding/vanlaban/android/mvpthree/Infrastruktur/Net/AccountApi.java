package coding.vanlaban.android.mvpthree.Infrastruktur.Net;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface AccountApi {
    @FormUrlEncoded
    @POST("token")
    Observable<Token> getToken(@Field("username") String username,
                               @Field("password") String password,
                               @Field("grant_type") String grantType);
}
