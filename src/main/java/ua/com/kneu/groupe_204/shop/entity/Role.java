package ua.com.kneu.groupe_204.shop.entity;

import java.util.HashSet;
import java.util.Set;

public class Role {

    private Long id;
    private String name;

    private Set<Client> clients = new HashSet<>();

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public Role(Long id, String name, Set<Client> clients) {
        this.id = id;
        this.name = name;
        this.clients = clients;
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

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }
}
