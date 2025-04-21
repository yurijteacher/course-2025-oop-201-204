package ua.com.kneu.groupe_202.example.entity;

import java.math.BigDecimal;
import java.util.List;

public class Products {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String image;

    private List<ProductHasOrder> productHasOrders;

    public List<ProductHasOrder> getProductHasOrders() {
        return productHasOrders;
    }

    public void setProductHasOrders(List<ProductHasOrder> productHasOrders) {
        this.productHasOrders = productHasOrders;
    }

    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Products() {
    }

    public Products(String name, String description, BigDecimal price, String image) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
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

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}
