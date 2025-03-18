package ua.com.kneu.groupe_201.lab2.homework_example.online_shop;

import java.util.List;

public class Product {

    private Long id;
    private String  name;
    private String  description;
    private Double price;
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

    public Product(String name, String description, Double price, String linkImage, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.linkImage = linkImage;
        this.category = category;
    }

    public Product(Long id, String name, String description, Double price, Category category, String linkImage) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.linkImage = linkImage;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", linkImage='" + linkImage + '\'' +
                '}';
    }
}
