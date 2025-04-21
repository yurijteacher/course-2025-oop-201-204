package ua.com.kneu.groupe_201.example2.dao;

import java.util.List;

public interface GeneralDao<T, K> {

    void save(T t);
    void update(T t);
    void delete(T t);
    T findById(K id);
    List<T> findAll();

}
