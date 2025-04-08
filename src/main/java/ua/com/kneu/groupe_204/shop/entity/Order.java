package ua.com.kneu.groupe_204.shop.entity;

import java.util.Date;
import java.util.List;

public class Order {

    private Long id;
    private Date dateCreated;
    private boolean login;

    private List<ProductHasOrder> productHasOrders;

    public List<ProductHasOrder> getProductHasOrders() {
        return productHasOrders;
    }

    public void setProductHasOrders(List<ProductHasOrder> productHasOrders) {
        this.productHasOrders = productHasOrders;
    }

    private Client client;

    private String payment;
    private String delivery;

    public Order(Date dateCreated, boolean login, Client client, String payment, String delivery) {
        this.dateCreated = dateCreated;
        this.login = login;
        this.client = client;
        this.payment = payment;
        this.delivery = delivery;
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
}
