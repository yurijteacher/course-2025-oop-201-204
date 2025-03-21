package ua.com.kneu.groupe_202.lab2.homework.online_shop;

import java.util.Date;
import java.util.List;

public class Order {

    private Long id;
    private Date dateCreated;
    private boolean status;
    private Delivery delivery;
    private Payment payment;
    private Customer customer;

    private List<ProductHasOrder> productHasOrders;

    public List<ProductHasOrder> getProductHasOrders() {
        return productHasOrders;
    }

    public void setProductHasOrders(List<ProductHasOrder> productHasOrders) {
        this.productHasOrders = productHasOrders;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", status=" + status +
                ", delivery=" + delivery +
                ", payment=" + payment +
                ", customer=" + customer +
                '}';
    }
}
