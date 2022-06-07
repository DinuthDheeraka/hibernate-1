/**
 * @author : Dinuth Dheeraka
 * Project Name: Hibernate-2
 * Date        : 6/7/2022
 * Time        : 9:05 PM
 */
package lk.ijse.supermarket.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
public class Item {
    @Id
    String itemCode;
    String description;
    double QOH;
    double unitPrice;
    double discount;
    LocalDate addedDate;
}
