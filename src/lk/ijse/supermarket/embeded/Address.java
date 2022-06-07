/**
 * @author : Dinuth Dheeraka
 * Project Name: Hibernate-2
 * Date        : 6/7/2022
 * Time        : 10:53 PM
 */
package lk.ijse.supermarket.embeded;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String address;
    private String city;
    private String province;

    public Address() {
    }

    public Address(String address, String city, String province) {
        this.setAddress(address);
        this.setCity(city);
        this.setProvince(province);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
