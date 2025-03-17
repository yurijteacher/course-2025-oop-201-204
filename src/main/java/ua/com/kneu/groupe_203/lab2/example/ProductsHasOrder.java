package ua.com.kneu.groupe_203.lab2.example;

public class ProductsHasOrder {

    private Long id;
    private Product product;
    private Order order;
    private int quantity;

    public ProductsHasOrder() {
    }

    public ProductsHasOrder(Long id, Product product, Order order, int quantity) {
        this.id = id;
        this.product = product;
        this.order = order;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductsHasOrder{" +
                "id=" + id +
                ", product=" + product +
                ", order=" + order +
                ", quantity=" + quantity +
                '}';
    }
}
