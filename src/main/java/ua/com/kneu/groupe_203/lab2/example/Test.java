package ua.com.kneu.groupe_203.lab2.example;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Category category = new Category();
        category.setId(1L);
        category.setName("beer");
        category.setDescription("beer asd  as d sad");


        Product product = new Product();
        product.setId(1L);
        product.setName("beer1");
        product.setDescription("asd asd asd");
        product.setCategory(category);
        product.setPrice(100.0);

        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("beer2");
        product2.setDescription("asd asd asd");
        product2.setCategory(category);
        product2.setPrice(110.0);


        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product2);

        category.setProducts(productList);

        Roles role1 = new Roles();
        role1.setId(1L);
        role1.setName("admin");

        Roles role2 = new Roles();
        role2.setId(2L);
        role2.setName("user");

        Roles role3 = new Roles();
        role3.setId(3L);
        role3.setName("manager");

        Set<Roles> rolesSet = new HashSet<>();
        rolesSet.add(role1);
        rolesSet.add(role2);
        rolesSet.add(role3);

        Customer customer = new Customer();
        customer.setId(1L);
        customer.setFirstName("Vasya");
        customer.setLastName("Pypkin");
        customer.setEmail("v1@ukr.net");
        customer.setPhone("51323");


        User user = new User();
        user.setId(1L);
        user.setUsername("Vasya");
        user.setPassword("1234");

        customer.setUser(user);

        user.setRolesSet(Collections.singleton(role1));

        Set<Roles> rolesSet2 = new HashSet<>();
        rolesSet2.add(role2);
        rolesSet2.add(role3);
        user.setRolesSet(rolesSet2);


        Order order = new Order();
        order.setId(1L);
        order.setCustomer(customer);
        order.setDelivery("asd");
        order.setPayment("cash");
        order.setDate(new Date());


        ProductsHasOrder result = new ProductsHasOrder();
        result.setProduct(product);
        result.setOrder(order);
        result.setQuantity(1);

        System.out.println(category);
        System.out.println(product);
        System.out.println(product2);

        System.out.println(rolesSet);
        System.out.println(customer);
        System.out.println(user);
        System.out.println(order);
        System.out.println(result);






    }


}
