package ua.com.kneu.groupe_201.example2.entity;

import java.util.Date;

public class Orders {

    private Long id;
    private Clients client;

    private Date dateCreated;
    private String delivery;
    private String payment;

    public Orders() {
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", client=" + client +
                ", dateCreated=" + dateCreated +
                ", delivery='" + delivery + '\'' +
                ", payment='" + payment + '\'' +
                '}';
    }

    public Orders(Clients client, Date dateCreated, String delivery, String payment) {
        this.client = client;
        this.dateCreated = dateCreated;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
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
}
