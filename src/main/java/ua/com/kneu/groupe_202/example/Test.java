package ua.com.kneu.groupe_202.example;

import ua.com.kneu.groupe_202.example.config.ConnectionToDb;
import ua.com.kneu.groupe_202.example.entity.Category;
import ua.com.kneu.groupe_202.example.entity.Products;
import ua.com.kneu.groupe_202.example.repository.CategoryRepository;
import ua.com.kneu.groupe_202.example.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        new ConnectionToDb().getConnection();

        Category category = new Category();
        category.setName("beer");
        category.setDescription("asd sqad");
        category.setImage("/static/images/beer.png");

        CategoryRepository categoryRepository = new CategoryRepository();

//        categoryRepository.save(category);

//        List<Category> categories = categoryRepository.findAll();
//
//        for (Category category1 : categories) {
//            System.out.println(category1);
//        }
//
//
//        Category category2 = categoryRepository.findById(4L);
//        category2.setName("apple");
//
//        categoryRepository.update(category2);
//
//
//        List<Category> categories2 = categoryRepository.findAll();
//        for (Category category_ : categories2) {
//            System.out.println(category_);
//        }
//
//        Category category3 = categoryRepository.findById(4L);
//
//        categoryRepository.delete(category3);
//        List<Category> categories3 = categoryRepository.findAll();
//        for (Category category_ : categories3) {
//            System.out.println(category_);
//        }

        Category category4= categoryRepository.findById(3L);


        Products product = new Products();
        product.setCategory(category4);
        product.setName("BMW9");
        product.setImage("/static/images/bmw7.png");
        product.setDescription("asd sqad");
        product.setPrice(new BigDecimal(100000));

        ProductRepository productRepository = new ProductRepository();
        productRepository.save(product);


        List<Products> products = productRepository.findAll();
        for (Products p : products) {
            System.out.println(p);
        }




    }


}
