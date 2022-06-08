import lk.ijse.supermarket.embeded.Address;
import lk.ijse.supermarket.embeded.City;
import lk.ijse.supermarket.embeded.Name;
import lk.ijse.supermarket.embeded.Province;
import lk.ijse.supermarket.entity.*;
import lk.ijse.supermarket.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import javax.persistence.ForeignKey;
import java.util.ArrayList;

/**
 * @author : Dinuth Dheeraka
 * Project Name: Hibernate-2
 * Date        : 6/7/2022
 * Time        : 10:02 PM
 */

public class ApplicationInitializer {

    public static void main(String[] args) {

        //creating customer object
        Customer customer1 = new Customer();
        customer1.setId("CM-001");
        customer1.setName(new Name("Dinuth","Dheeraka","Sethmal"));
        customer1.setAddress(new Address("No,178",String.valueOf(City.KALUTARA),String.valueOf(Province.WESTERN)));
        customer1.setContactNumber("0771234567");
        customer1.setSalary(100000.00);

        //creating supplier object
        Supplier supplier1 = new Supplier();
        supplier1.setSupplierId("SP-001");
        supplier1.setCompanyName("Malibon");
        supplier1.setAddress(new Address("No 1/100",String.valueOf(City.KALUTARA),String.valueOf(Province.WESTERN)));
        supplier1.seteMail("malibonkalutara@gmail.com");
        supplier1.setContactNumber("0345676543");

        // String itemCode, String description, String packSize,double QOH, double unitPrice, double discount,Supplier supplier
        //creating item object
        Item item1 = new Item(
               "IM-001","Malibon Cream Cracker","100g",100,100,0,supplier1
        );

        //creating a order
        Orders orders1 = new Orders(
                "OR-001",customer1
        );

        //creating a order detail
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setItem(item1);
        orderDetail.setOrder(orders1);
        orderDetail.setQty(10);
        orderDetail.setUnitPrice(orderDetail.getItem().getUnitPrice());
        orderDetail.setGivenDiscount(orderDetail.getItem().getDiscount());

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(orderDetail);

        transaction.commit();
        session.close();


    }
}
