package ua.com.kneu.groupe_203.example;

import ua.com.kneu.groupe_203.example.config.ConnectionToDB;
import ua.com.kneu.groupe_203.example.entity.Category;
import ua.com.kneu.groupe_203.example.repository.CategoryRepository;

import java.sql.SQLException;
import java.util.List;

public class Test {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ConnectionToDB connectionToDB = new ConnectionToDB();

        connectionToDB.getConnectionToDB();

        Category category = new Category();
        category.setName("Car");
        category.setDescription("Car description");
        category.setImage("/static/images/car.jpg");


        CategoryRepository categoryRepository = new CategoryRepository();
        categoryRepository.save(category);

        List<Category> categories = categoryRepository.findAll();

        for (Category category1 : categories) {
            System.out.println(category1);
        }


        Category category1 = categoryRepository.findById(1L);

        System.out.println(category1);

        category1.setName("Auto Car");

        categoryRepository.update(category1);
        Category category2 = categoryRepository.findById(1L);
        System.out.println(category2);

        categoryRepository.delete(category1);
        Category category3 = categoryRepository.findById(1L);
        System.out.println(category3);



    }

}
