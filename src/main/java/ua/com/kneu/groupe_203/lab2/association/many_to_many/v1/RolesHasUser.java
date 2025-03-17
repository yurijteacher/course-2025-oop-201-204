package ua.com.kneu.groupe_203.lab2.association.many_to_many.v1;

public class RolesHasUser {

    private Long id;
    private Role role;
    private User user;

    public RolesHasUser() {
    }

    public RolesHasUser(Long id, Role role, User user) {
        this.id = id;
        this.role = role;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "RolesHasUser{" +
                "id=" + id +
                ", role=" + role +
                ", user=" + user +
                '}';
    }
}
