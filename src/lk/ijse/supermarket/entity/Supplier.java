/**
 * @author : Dinuth Dheeraka
 * Project Name: Hibernate-2
 * Date        : 6/8/2022
 * Time        : 9:52 AM
 */
package lk.ijse.supermarket.entity;

import lk.ijse.supermarket.embeded.Address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {
    @Id
    private String supplierId;
    private String companyName;
    private Address address;
    @Column(length = 10)
    private String contactNumber;
    private String eMail;

    public Supplier(){}

    public Supplier(String supplierId, String companyName, Address address, String contactNumber, String eMail) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.eMail = eMail;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
