package ua.com.kneu.groupe_204.shop.repository;

import ua.com.kneu.groupe_204.shop.dao.ClientDao;
import ua.com.kneu.groupe_204.shop.entity.Client;

import java.util.List;

public class ClientRepository implements ClientDao {

    @Override
    public void save(Client client) {

    }

    @Override
    public void update(Client client, Long id) {

    }

    @Override
    public void delete(Client client) {

    }

    @Override
    public Client findById(Long id) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return List.of();
    }
}
