package ua.com.kneu.groupe_201.lab2.homework_example.online_shop;

import java.util.Set;

public class Roles {

    private Long id;
    private String name;

    private Set<Customer> customers;

    public Set<Customer> getCustomers() {
        return customers;
    }

    public Roles() {
    }

    public Roles(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
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
        return "Roles{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
