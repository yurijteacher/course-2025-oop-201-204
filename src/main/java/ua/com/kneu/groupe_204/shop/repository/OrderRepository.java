package ua.com.kneu.groupe_204.shop.repository;

import ua.com.kneu.groupe_204.shop.dao.OrderDao;
import ua.com.kneu.groupe_204.shop.entity.Order;

import java.util.List;

public class OrderRepository implements OrderDao {

    @Override
    public void save(Order order) {

    }

    @Override
    public void update(Order order, Long id) {

    }

    @Override
    public void delete(Order order) {

    }

    @Override
    public Order findById(Long id) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return List.of();
    }
}
