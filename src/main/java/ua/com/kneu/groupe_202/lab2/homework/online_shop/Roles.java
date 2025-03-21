package ua.com.kneu.groupe_202.lab2.homework.online_shop;

import java.util.HashSet;
import java.util.Set;

public class Roles {

    private Long id;
    private String name;

    private Set<User> users = new HashSet<>();

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users=" + users +
                '}';
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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
