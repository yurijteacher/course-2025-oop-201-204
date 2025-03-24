package ua.com.kneu.lecture.structural.adapter.v2;

public class UserAdapter extends Customer implements UserDetails{

    @Override
    public String getUser() {
        return getLogin();
    }

    @Override
    public String getPass() {
        return getPassword();
    }

}
