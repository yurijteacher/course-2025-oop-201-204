package ua.com.kneu.lecture.structural.adapter.v1;

import ua.com.kneu.lecture.structural.adapter.v2.UserDetails;

public class Customer implements UserDetails {

    private Long id;

    private String login;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer() {
    }

    public Customer(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public String getUser() {
        return login;
    }

    @Override
    public String getPass() {
        return password;
    }
}
