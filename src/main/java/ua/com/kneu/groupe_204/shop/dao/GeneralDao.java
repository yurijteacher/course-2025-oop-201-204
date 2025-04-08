package ua.com.kneu.groupe_204.shop.dao;

import java.util.List;

public interface GeneralDao<T, K> {

    void save(T t);
    void update(T t, K id);
    void delete(T t);
    T findById(K id);
    List<T> findAll();

}
