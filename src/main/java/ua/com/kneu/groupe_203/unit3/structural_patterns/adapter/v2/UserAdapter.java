package ua.com.kneu.groupe_203.unit3.structural_patterns.adapter.v2;

public class UserAdapter extends Customer implements UserDetails {
    @Override
    public String getUsername() {
        return getLogin();
    }

    @Override
    public String getPassword() {
       return getPassword();
    }
}
