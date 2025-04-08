package ua.com.kneu.groupe_204.shop.repository;

import ua.com.kneu.groupe_204.shop.dao.ProductHasOrderDao;
import ua.com.kneu.groupe_204.shop.entity.ProductHasOrder;

import java.util.List;

public class ProductHasOrderRepository implements ProductHasOrderDao {
    @Override
    public void save(ProductHasOrder productHasOrder) {

    }

    @Override
    public void update(ProductHasOrder productHasOrder, Long id) {

    }

    @Override
    public void delete(ProductHasOrder productHasOrder) {

    }

    @Override
    public ProductHasOrder findById(Long id) {
        return null;
    }

    @Override
    public List<ProductHasOrder> findAll() {
        return List.of();
    }
}
