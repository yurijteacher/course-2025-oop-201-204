package ua.com.kneu.groupe_201.lab2.association.many_to_many.v1;

import java.util.List;

public class Roles {

    private Long id;
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
