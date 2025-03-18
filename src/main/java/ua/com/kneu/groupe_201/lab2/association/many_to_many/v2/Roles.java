package ua.com.kneu.groupe_201.lab2.association.many_to_many.v2;

import java.util.HashSet;
import java.util.Set;

public class Roles {

    private Long id;
    private String name;

    private Set<User> users = new HashSet<>();



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
