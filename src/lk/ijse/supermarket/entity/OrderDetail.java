/**
 * @author : Dinuth Dheeraka
 * Project Name: Hibernate-2
 * Date        : 6/8/2022
 * Time        : 11:56 AM
 */
package lk.ijse.supermarket.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;

@Entity
public class OrderDetail implements Serializable {
    @ManyToOne@Id
    private Orders order;
    @ManyToOne@Id
    private Item item;
    private double qty;
    private double unitPrice;
    private double givenDiscount;

    public OrderDetail() {
    }

    public OrderDetail(Orders order, Item item, double qty, double unitPrice, double givenDiscount) {
        this.order = order;
        this.item = item;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.givenDiscount = givenDiscount;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getGivenDiscount() {
        return givenDiscount;
    }

    public void setGivenDiscount(double givenDiscount) {
        this.givenDiscount = givenDiscount;
    }
}
