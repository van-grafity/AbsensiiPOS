package coding.vanlaban.android.mvpthree.Infrastruktur;

import coding.vanlaban.android.mvpthree.Model.User;

public interface UserStore {

    User findByName(String username);

    String[] getUserNames();

}


