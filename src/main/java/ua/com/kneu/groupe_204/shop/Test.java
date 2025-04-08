package ua.com.kneu.groupe_204.shop;

import ua.com.kneu.groupe_204.shop.configuration.ConnectionToDB;
import ua.com.kneu.groupe_204.shop.entity.Category;
import ua.com.kneu.groupe_204.shop.entity.Product;
import ua.com.kneu.groupe_204.shop.repository.CategoryRepository;
import ua.com.kneu.groupe_204.shop.repository.ProductRepository;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        ConnectionToDB connectionToDB = new ConnectionToDB();

        Connection connection = connectionToDB.getConnectionToDB();

        Category car = new Category();
        car.setName("car");
        car.setDescription("car description");
        car.setUrlImage("/static/images/car.jpg");

        CategoryRepository categoryRepository = new CategoryRepository(connection);

//        categoryRepository.save(car);

        List<Category> categories = categoryRepository.findAll();

        for (Category category : categories) {
            System.out.println(category);
        }

        Category category = categoryRepository.findById(3L);

        System.out.println(category);

        category.setName("apple");

        categoryRepository.update(category, 3L);

        List<Category> categories2 = categoryRepository.findAll();

        for (Category category2 : categories2) {
            System.out.println(category2);
        }

        Category category2 = categoryRepository.findById(3L);

//        categoryRepository.delete(category2);

        List<Category> categories3 = categoryRepository.findAll();
        for (Category category3 : categories3) {
            System.out.println(category3);
        }

        ProductRepository productRepository = new ProductRepository(connection);

        Product beer1 = new Product();
        beer1.setName("beer1");
        beer1.setDescription("beer description");
        beer1.setImage("/static/images/beer.jpg");
        beer1.setPrice(new BigDecimal(150.555));
        beer1.setCategory(category);

        productRepository.save(beer1);

        List<Product> products = productRepository.findAll();
        for (Product product : products) {
            System.out.println(product);
        }



    }

}
