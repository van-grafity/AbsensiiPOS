package coding.vanlaban.android.mvpthree.Infrastruktur;

import coding.vanlaban.android.mvpthree.Model.User;
import coding.vanlaban.android.mvpthree.Model.UserImpl;
import coding.vanlaban.android.mvpthree.Model.UserNull;

public class UserStoreAdapter implements UserStore {
    User[] users = {
            new UserImpl("Ivan", "123"),
            new UserImpl("Agung", "123"),
            new UserImpl("Erwin", "123"),
            new UserImpl("Irvan","123"),
            new UserImpl("Pak_Fatur","123"),
            new UserImpl("xXx","123")
    };

    @Override
    public User findByName(String username) {
        for (int posisi = 0; posisi < users.length; posisi++) {
            User user = users[posisi];
            if (user.getUserName().equals(username))
                return user;
        }
        return new UserNull();
    }

    @Override
    public String[] getUserNames() {
        String[] result = new String[users.length];
        for (int posisi = 0; posisi < users.length; posisi++) {
            result[posisi] = users[posisi].getUserName();
        }
        return result;
    }
}