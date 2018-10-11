package coding.vanlaban.android.mvpthree.Model;

public class UserNull implements User {
    @Override
    public boolean validatePassword(String password) {
        return false;
    }

    @Override
    public String getUserName() {
        return "Null User";
    }

}
