package ua.com.kneu.groupe_203.lab2.association.one_to_many;

public class Product {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String urlImage;

    private Category category;

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
                ", urlImage='" + urlImage + '\'' +
                '}';
    }

    public Product() {
    }

    public Product(Long id, String name, String description, Double price, String urlImage) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.urlImage = urlImage;
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

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
