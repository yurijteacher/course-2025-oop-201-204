package ua.com.kneu.groupe_201.example2;

import ua.com.kneu.groupe_201.example2.configuration.ConnectionToDb;
import ua.com.kneu.groupe_201.example2.entity.Categories;
import ua.com.kneu.groupe_201.example2.repository.CategoriesRepository;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        ConnectionToDb connectionToDb = new ConnectionToDb();

        connectionToDb.getConnection();

        CategoriesRepository categoriesRepository = new CategoriesRepository();

        Categories category = new Categories();
        category.setName("iPhone");
        category.setDescription("sawqe w qe  wq e ");
        category.setImage("/static/iphone15.jpg");

        categoriesRepository.save(category);

        List<Categories> categories = categoriesRepository.findAll();

        for (Categories c : categories) {
            System.out.println(c);
        }



    }

}
