package ua.com.kneu.groupe_203.lab2.association.many_to_many.v2;

import java.util.HashSet;
import java.util.Set;

public class Role {

    private Long id;
    private String name;

    private Set<User> userSet = new HashSet<>();

}
