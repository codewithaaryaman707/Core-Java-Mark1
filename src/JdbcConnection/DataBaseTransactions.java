package JdbcConnection;
import java.util.ArrayList;
public class DataBaseTransactions {
    public static void main(String[] args) {

        // inserting value in database.
        Customer customer = new Customer("Aditya",22,"8591059220","Indian");
        CustomerDao.insertCustomer(customer);

        // updateing customer in database.
        Customer updateCustomer = new Customer("Aditya Kelaskar",22,"8591059220","Indian");
        CustomerDao.insertCustomer(updateCustomer);

        // delete from customer database.
        CustomerDao.deleteCustomer(22);

        // getting all customers.
        ArrayList<Customer> arrayList = new ArrayList<Customer>();
        arrayList=CustomerDao.getCustomers();
        for(Customer custome1:arrayList)
            System.out.println(custome1.toString());

//        for getting single Customer
        System.out.println(CustomerDao.getCustomers(22));

    }
}
