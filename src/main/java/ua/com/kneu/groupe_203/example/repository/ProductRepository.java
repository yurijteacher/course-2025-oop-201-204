package ua.com.kneu.groupe_203.example.repository;

import ua.com.kneu.groupe_203.example.dao.ProductDao;
import ua.com.kneu.groupe_203.example.entity.Product;

import java.util.List;

public class ProductRepository implements ProductDao {
    @Override
    public void save(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }
}
