package ua.com.kneu.groupe_203.example;

import ua.com.kneu.groupe_203.example.config.ConnectionToDB;
import ua.com.kneu.groupe_203.example.entity.Category;
import ua.com.kneu.groupe_203.example.entity.Clients;
import ua.com.kneu.groupe_203.example.entity.Product;
import ua.com.kneu.groupe_203.example.repository.CategoryRepository;
import ua.com.kneu.groupe_203.example.repository.ClientRepository;
import ua.com.kneu.groupe_203.example.repository.ProductRepository;

import java.math.BigDecimal;
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
//        categoryRepository.save(category);

        List<Category> categories = categoryRepository.findAll();

        for (Category category1 : categories) {
            System.out.println(category1);
        }

        Category categoryById = categoryRepository.findById(3L);


//        Category category1 = categoryRepository.findById(1L);

//        System.out.println(category1);

//        category1.setName("Auto Car");

//        categoryRepository.update(category1);
//        Category category2 = categoryRepository.findById(1L);
//        System.out.println(category2);

//        categoryRepository.delete(category1);
//        Category category3 = categoryRepository.findById(1L);
//        System.out.println(category3);

        Product product = new Product();
        product.setName("BMW 11");
        product.setDescription("Product description");
        product.setPrice(new BigDecimal(10000.5577));
        product.setCategory(categoryById);
        product.setImage("/static/images/bmw7.jpg");

        ProductRepository productRepository  = new ProductRepository();
//        productRepository.save(product);

        List<Product> products = productRepository.findAll();

        for (Product product1 : products) {
            System.out.println(product1);
        }

        Product product1 = productRepository.findById(1L);
        product1.setDescription("Product description");

        productRepository.update(product1);

        List<Product> products1 = productRepository.findAll();

        for (Product product2 : products1) {
            System.out.println(product2);
        }


        Product product2  = productRepository.findById(4L);
//        productRepository.delete(product2);

        List<Product> products2 = productRepository.findAll();
        for (Product product3 : products2) {
            System.out.println(product3);
        }

        Clients client = new Clients();
        client.setFirstName("Ivanna");
        client.setLastName("Pypkina");
        client.setEmail("iva@gmail.com");
        client.setPhone("51323");

        ClientRepository clientRepository = new ClientRepository();
        clientRepository.save(client);

        List<Clients> clients1 = clientRepository.findAll();
        for (Clients client1 : clients1) {
            System.out.println(client1);
        }


    }

}
