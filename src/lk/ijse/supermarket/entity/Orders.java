/**
 * @author : Dinuth Dheeraka
 * Project Name: Hibernate-2
 * Date        : 6/8/2022
 * Time        : 9:38 AM
 */
package lk.ijse.supermarket.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.criterion.Order;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Orders {
    @Id
    private String orderId;
    @ManyToOne
    private Customer customer;
    @CreationTimestamp
    private LocalDate date;
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails = new ArrayList();

    public Orders() {
    }

    public Orders(String orderId, Customer customer, LocalDate date) {
        this.orderId = orderId;
        this.customer = customer;
        this.date = date;
    }

    public Orders(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
