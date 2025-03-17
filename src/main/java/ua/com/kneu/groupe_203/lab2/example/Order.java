package ua.com.kneu.groupe_203.lab2.example;

import java.util.Date;
import java.util.List;

public class Order
{

    private Long id;
    private Date date;
    private Customer customer;

    private String delivery;
    private String payment;

    private List<ProductsHasOrder> productsHasOrderList;

    public List<ProductsHasOrder> getProductsHasOrderList() {
        return productsHasOrderList;
    }

    public void setProductsHasOrderList(List<ProductsHasOrder> productsHasOrderList) {
        this.productsHasOrderList = productsHasOrderList;
    }

    public Order() {
    }

    public Order(Long id, Date date, Customer customer, String delivery, String payment) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.delivery = delivery;
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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
                ", date=" + date +
                ", customer=" + customer +
                ", delivery='" + delivery + '\'' +
                ", payment='" + payment + '\'' +
                '}';
    }
}
