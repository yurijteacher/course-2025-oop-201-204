package ua.com.kneu.groupe_204.shop.repository;

import ua.com.kneu.groupe_204.shop.dao.RoleDao;
import ua.com.kneu.groupe_204.shop.entity.Role;

import java.util.List;

public class RolesRepository implements RoleDao {

    @Override
    public void save(Role role) {

    }

    @Override
    public void update(Role role, Long id) {

    }

    @Override
    public void delete(Role role) {

    }

    @Override
    public Role findById(Long id) {
        return null;
    }

    @Override
    public List<Role> findAll() {
        return List.of();
    }
}
