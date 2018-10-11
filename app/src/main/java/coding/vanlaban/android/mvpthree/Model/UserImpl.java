package coding.vanlaban.android.mvpthree.Model;

public class UserImpl implements User {
    String userName;
    String password;
    public UserImpl(String userName, String password) {
        this.password = password;
        this.userName = userName;
    }

    @Override
    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

}
