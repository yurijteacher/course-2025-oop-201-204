package ua.com.kneu.groupe_203.lab2.association.many_to_many.v1;

import java.util.List;

public class Role {

    private Long id;
    private String name;

    public Role() {
    }

    private List<RolesHasUser> rolesHasUserList;

    public List<RolesHasUser> getRolesHasUserList() {
        return rolesHasUserList;
    }

    public void setRolesHasUserList(List<RolesHasUser> rolesHasUserList) {
        this.rolesHasUserList = rolesHasUserList;
    }

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
