/**
 * @author : Dinuth Dheeraka
 * Project Name: Hibernate-2
 * Date        : 6/7/2022
 * Time        : 9:05 PM
 */
package lk.ijse.supermarket.entity;

import lk.ijse.supermarket.embeded.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Customer {
    @Id
    String id;
    Name name;
    String address;
    String contactNumber;
    Double salary;
    LocalDate registeredDate;
}
