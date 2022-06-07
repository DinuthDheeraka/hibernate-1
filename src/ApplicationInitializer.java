import lk.ijse.supermarket.embeded.Address;
import lk.ijse.supermarket.embeded.City;
import lk.ijse.supermarket.embeded.Name;
import lk.ijse.supermarket.embeded.Province;
import lk.ijse.supermarket.entity.Customer;
import lk.ijse.supermarket.entity.Item;
import lk.ijse.supermarket.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author : Dinuth Dheeraka
 * Project Name: Hibernate-2
 * Date        : 6/7/2022
 * Time        : 10:02 PM
 */

public class ApplicationInitializer {

    public static void main(String[] args) {

//        Customer customer1 = new Customer();
//        customer1.setId("CM-001");
//        customer1.setName(new Name("Dinuth","Dheeraka","Sethmal"));
//        customer1.setAddress(new Address("No,178",String.valueOf(City.KALUTARA),String.valueOf(Province.WESTERN)));
//        customer1.setContactNumber("0771234567");
//        customer1.setSalary(100000.00);

        Item item1 = new Item(
                "IT-001","Milo","180ml",10,100,0
        );

        Session session = FactoryConfiguration.getInstance(Item.class).getSession();
        Transaction transaction = session.beginTransaction();

        session.save(item1);
        transaction.commit();
        session.close();


    }
}
