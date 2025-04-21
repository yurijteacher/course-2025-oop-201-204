package ua.com.kneu.groupe_201.example2.entity;

import java.util.List;

public class Categories {

    private Long id;

    private String name;
    private String description;
    private String image;
    private List<Products> products;

    public Categories() {
    }

    public Categories(Long id, String name, String description, String image, List<Products> products) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", products=" + products +
                '}';
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}
