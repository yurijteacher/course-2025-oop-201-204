package ua.com.kneu.groupe_201.example2.repository;

import ua.com.kneu.groupe_201.example2.dao.ProductsDao;
import ua.com.kneu.groupe_201.example2.entity.Products;

import java.util.List;

public class ProductsRepository implements ProductsDao {
    @Override
    public void save(Products products) {

    }

    @Override
    public void update(Products products) {

    }

    @Override
    public void delete(Products products) {

    }

    @Override
    public Products findById(Long id) {
        return null;
    }

    @Override
    public List<Products> findAll() {
        return List.of();
    }
}
