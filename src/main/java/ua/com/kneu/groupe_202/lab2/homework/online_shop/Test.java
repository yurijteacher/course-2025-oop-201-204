package ua.com.kneu.groupe_202.lab2.homework.online_shop;

import javax.management.relation.Role;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        Category category = new Category();
        category.setId(1L);
        category.setName("beer");
        category.setDescription("asd as d sad");
        category.setLinkImage("/static/images/beer.png");

        Category category2 = new Category(2L, "car","asd asdasd","/static/images/car.png");

        Product product = new Product();
        product.setId(1L);
        product.setName("Seat 2000");
        product.setDescription("asd asdasd");
        product.setLinkImage("/static/images/car1.png");
        product.setCategory(category2);
        product.setPrice(25000000);

        Product product2 = new Product(2L, "Honda CRV","asd asd s ad",23400000, "/static/car2.jpg",category2);


        System.out.println(product);
        System.out.println(product2);

        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product2);

        for (Product el : products) {
            System.out.println(el);
        }


        Customer customer = new Customer();

        customer.setId(1L);
        customer.setFirstName("Вася");
        customer.setLastName("Пупкін");
        customer.setEmail("vasya@gmail.com");
        customer.setPhone("+380501112233");

        Address address = new Address();
        address.setId(1L);
        address.setState("asd");
        address.setCity("asd");
        address.setStreet("street");
        address.setZip("12345");

        customer.setAddressList(Collections.singletonList(address));


        User user = new User();
        user.setId(1L);
        user.setLogin("Vasya");
        user.setPassword("1234");

        Roles role1 = new Roles();
        role1.setId(1L);
        role1.setName("admin");
        Roles role2 = new Roles();
        role2.setId(2L);
        role2.setName("user");

        Set<Roles> rolesSet = new HashSet<>();
        rolesSet.add(role1);
        rolesSet.add(role2);

        user.setRolesSet(rolesSet);

        customer.setUser(user);

        System.out.println(customer);

        Order order = new Order();
        order.setId(1L);
        order.setCustomer(customer);
        order.setDateCreated(new Date());

        System.out.println(order);

        ProductHasOrder productHasOrder = new ProductHasOrder();
        productHasOrder.setId(1L);
        productHasOrder.setOrder(order);
        productHasOrder.setProduct(product2);
        productHasOrder.setQuantity(1);

        System.out.println(productHasOrder);

        ProductHasOrder productHasOrder2 = new ProductHasOrder();
        productHasOrder2.setId(2L);
        productHasOrder2.setProduct(product2);
        productHasOrder2.setQuantity(1);
        productHasOrder2.setOrder(order);

        System.out.println(productHasOrder2);




    }


}
