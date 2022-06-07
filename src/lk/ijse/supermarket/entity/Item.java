/**
 * @author : Dinuth Dheeraka
 * Project Name: Hibernate-2
 * Date        : 6/7/2022
 * Time        : 9:05 PM
 */
package lk.ijse.supermarket.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Item {
    @Id
    private String itemCode;
    @Column(nullable = true)
    private String description;
    private String packSize;
    private double QOH;
    private double unitPrice;
    private double discount;
    @CreationTimestamp
    private LocalDate addedDate;

    public Item() {
    }

    public Item(String itemCode, String description,String packSize,double QOH, double unitPrice, double discount, LocalDate addedDate) {
        this.setItemCode(itemCode);
        this.setDescription(description);
        this.setPackSize(packSize);
        this.setQOH(QOH);
        this.setUnitPrice(unitPrice);
        this.setDiscount(discount);
        this.setAddedDate(addedDate);
    }

    public Item(String itemCode, String description, String packSize,double QOH, double unitPrice, double discount) {
        this.itemCode = itemCode;
        this.description = description;
        this.packSize = packSize;
        this.QOH = QOH;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getQOH() {
        return QOH;
    }

    public void setQOH(double QOH) {
        this.QOH = QOH;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }
}
