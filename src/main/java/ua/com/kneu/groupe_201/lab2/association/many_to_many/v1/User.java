package ua.com.kneu.groupe_201.lab2.association.many_to_many.v1;

import java.util.List;

public class User {

    private Long id;
    private String username;
    private String password;

    private List<RolesHasUser> rolesHasUserList;

    public List<RolesHasUser> getRolesHasUserList() {
        return rolesHasUserList;
    }

    public void setRolesHasUserList(List<RolesHasUser> rolesHasUserList) {
        this.rolesHasUserList = rolesHasUserList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
