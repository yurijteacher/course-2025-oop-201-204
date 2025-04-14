package ua.com.kneu.groupe_203.example.dao;

import java.util.List;

public interface GeneralDao<T, K> {

    void save(T t);
    void update(T t);
    void delete(T t);
    T findById(K id);
    List<T> findAll();

}
