package ua.com.kneu.groupe_202.lab2.homework.online_shop;

import ua.com.kneu.groupe_202.unit2.aggregation.Car;

import java.util.List;

public class Product {

    private Long id;
    private String name;
    private String description;
    private double price;
    private String linkImage;

    private List<ProductHasOrder> productHasOrderList;

    public List<ProductHasOrder> getProductHasOrderList() {
        return productHasOrderList;
    }

    public void setProductHasOrderList(List<ProductHasOrder> productHasOrderList) {
        this.productHasOrderList = productHasOrderList;
    }

    private Category category;

    public Product() {
    }

    public Product(Long id, String name, String description, double price, String linkImage, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.linkImage = linkImage;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", linkImage='" + linkImage + '\'' +
                ", productHasOrderList=" + productHasOrderList +
                ", category=" + category +
                '}';
    }
}
