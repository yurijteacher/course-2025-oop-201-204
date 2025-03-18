package ua.com.kneu.groupe_201.lab2.homework_example.online_shop;

import java.util.Date;
import java.util.List;

public class Orders {

    private Long id;
    private Date date;

    private Delivery delivery;
    private Payment payment;

    private boolean statusOrder;

    private Customer customer;


    private List<ProductHasOrder> productHasOrderList;

    public List<ProductHasOrder> getProductHasOrderList() {
        return productHasOrderList;
    }

    public void setProductHasOrderList(List<ProductHasOrder> productHasOrderList) {
        this.productHasOrderList = productHasOrderList;
    }

    public Orders() {}

    public Orders(Long id, Date date, Delivery delivery, Payment payment) {
        this.id = id;
        this.date = date;
        this.delivery = delivery;
        this.payment = payment;
        this.statusOrder = false;
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

    public boolean isStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(boolean statusOrder) {
        this.statusOrder = statusOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", date=" + date +
                ", delivery=" + delivery +
                ", payment=" + payment +
                ", statusOrder=" + statusOrder +
                ", customer=" + customer +
                '}';
    }
}
