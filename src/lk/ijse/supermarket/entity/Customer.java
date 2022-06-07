/**
 * @author : Dinuth Dheeraka
 * Project Name: Hibernate-2
 * Date        : 6/7/2022
 * Time        : 9:05 PM
 */
package lk.ijse.supermarket.entity;

import lk.ijse.supermarket.embeded.Address;
import lk.ijse.supermarket.embeded.Name;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Customer {
    @Id
    private
    String id;
    private Name name;
    private Address address;
    @Column(length = 10)
    private String contactNumber;
    private Double salary;
    @CreationTimestamp
    private LocalDate registeredDate;

    public Customer() {
    }

    public Customer(String id, Name name, Address address, String contactNumber, Double salary, LocalDate registeredDate) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setContactNumber(contactNumber);
        this.setSalary(salary);
        this.setRegisteredDate(registeredDate);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }
}
