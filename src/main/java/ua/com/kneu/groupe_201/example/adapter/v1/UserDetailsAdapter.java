package ua.com.kneu.groupe_201.example.adapter.v1;

public class UserDetailsAdapter extends Customer implements UserDetails {
    @Override
    public String getUsername() {
        return getLogin();
    }

    @Override
    public String getPassword() {
        return getPass();
    }
}
