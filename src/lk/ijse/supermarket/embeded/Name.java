/**
 * @author : Dinuth Dheeraka
 * Project Name: Hibernate-2
 * Date        : 6/7/2022
 * Time        : 9:06 PM
 */
package lk.ijse.supermarket.embeded;

import javax.persistence.Embeddable;

@Embeddable
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name() {
    }

    public Name(String firstName, String middleName, String lastName) {
        this.setFirstName(firstName);
        this.setMiddleName(middleName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
