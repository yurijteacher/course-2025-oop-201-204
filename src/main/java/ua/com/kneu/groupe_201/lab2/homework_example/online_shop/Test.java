package ua.com.kneu.groupe_201.lab2.homework_example.online_shop;

public class Test {

    public static void main(String[] args) {

        Category category = new Category();
        category.setId(1L);
        category.setName("Beer");
        category.setDescription("asd a s d sad");
        category.setLinkImage("/static/images/beer.png");

        Category category1 = new Category(2L,
                "car", "asd asd sad", "/static/images/car.png");


        Product product = new Product();
        product.setId(1L);
        product.setName("Seat2000");
        product.setDescription("asd asd sad");
        product.setLinkImage("/static/images/seat2000.png");
        product.setCategory(category1);

        System.out.println(product);
        System.out.println(category1);

    }


}
