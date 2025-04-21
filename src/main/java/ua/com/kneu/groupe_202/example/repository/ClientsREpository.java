package ua.com.kneu.groupe_202.example.repository;

import ua.com.kneu.groupe_202.example.dao.ClientsDao;
import ua.com.kneu.groupe_202.example.entity.Clients;

import java.util.List;

public class ClientsREpository implements ClientsDao {
    @Override
    public void save(Clients clients) {

    }

    @Override
    public void update(Clients clients) {

    }

    @Override
    public void delete(Clients clients) {

    }

    @Override
    public Clients findById(Long id) {
        return null;
    }

    @Override
    public List<Clients> findAll() {
        return List.of();
    }
}
