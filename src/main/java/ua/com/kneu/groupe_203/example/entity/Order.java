package ua.com.kneu.groupe_203.example.entity;

import java.util.Date;

public class Order {

    private Long id;

    private Clients client;

    private Date createdOrder;
    private String delivery;
    private String payment;

    public Order() {
    }

    public Order(Clients client, Date createdOrder, String delivery, String payment) {
        this.client = client;
        this.createdOrder = createdOrder;
        this.delivery = delivery;
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Clients getClient() {
        return client;
    }

    public void setClient(Clients client) {
        this.client = client;
    }

    public Date getCreatedOrder() {
        return createdOrder;
    }

    public void setCreatedOrder(Date createdOrder) {
        this.createdOrder = createdOrder;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", client=" + client +
                ", createdOrder=" + createdOrder +
                ", delivery='" + delivery + '\'' +
                ", payment='" + payment + '\'' +
                '}';
    }
}
