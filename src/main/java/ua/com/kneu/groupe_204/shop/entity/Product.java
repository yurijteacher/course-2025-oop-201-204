package ua.com.kneu.groupe_204.shop.entity;

import java.math.BigDecimal;
import java.util.List;

public class Product {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;  // **.**
    private String image;

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

    public Product(Long id, String name, String description, BigDecimal price, String image, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
                ", image='" + image + '\'' +
//                ", productHasOrderList=" + productHasOrderList +
                ", category=" + category +
                '}';
    }
}
