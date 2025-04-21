package ua.com.kneu.groupe_202.example.entity;

import java.util.Date;
import java.util.List;

public class Orders {

    private Long id;
    private String payment;
    private String delivery;
    private String status;

    private List<ProductHasOrder> productHasOrderList;

    public List<ProductHasOrder> getProductHasOrderList() {
        return productHasOrderList;
    }

    public void setProductHasOrderList(List<ProductHasOrder> productHasOrderList) {
        this.productHasOrderList = productHasOrderList;
    }

    private Date dateCreated;

    private Clients client;

    public Orders() {
    }

    public Orders(String payment, String delivery, String status, Date dateCreated, Clients client) {
        this.payment = payment;
        this.delivery = delivery;
        this.status = status;
        this.dateCreated = dateCreated;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Clients getClient() {
        return client;
    }

    public void setClient(Clients client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", payment='" + payment + '\'' +
                ", delivery='" + delivery + '\'' +
                ", status='" + status + '\'' +
                ", dateCreated=" + dateCreated +
                ", client=" + client +
                '}';
    }
}
