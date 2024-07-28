package JdbcConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
public class CustomerDao {
    public static void insertCustomer(Customer customer){
        Connection connection=null;
        PreparedStatement insertStatement=null;
        try{
            Class.forName(Keys.DRIVER);
             connection = DriverManager.getConnection(Keys.URL,Keys.USERNAME,Keys.PASSWORD);
             insertStatement = connection.prepareStatement(Keys.INSERT_QUERY);
            insertStatement.setInt(1,customer.id);
            insertStatement.setString(2,customer.name);
            insertStatement.setInt(3,customer.age);
            insertStatement.setString(4,customer.contact);
            insertStatement.setString(5,customer.nationality);
            insertStatement.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
                insertStatement.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public static void updateCustomer(Customer customer){
        Connection connection=null;
        PreparedStatement updateStatement=null;
        try{
            Class.forName(Keys.DRIVER);
            connection = DriverManager.getConnection(Keys.URL,Keys.USERNAME,Keys.PASSWORD);
            updateStatement = connection.prepareStatement(Keys.UPDATE_QUERY);
            updateStatement.setString(1,customer.name);
            updateStatement.setInt(2,customer.id);
            updateStatement.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
                updateStatement.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public static void deleteCustomer(int id){
        Connection connection=null;
        PreparedStatement deleteStatement=null;
        try{
            Class.forName(Keys.DRIVER);
            connection = DriverManager.getConnection(Keys.URL,Keys.USERNAME,Keys.PASSWORD);
            deleteStatement = connection.prepareStatement(Keys.UPDATE_QUERY);
            deleteStatement.setInt(1,id);
            deleteStatement.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
                deleteStatement.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public static ArrayList<Customer> getCustomers(){
        Connection connection=null;
        PreparedStatement getQuery=null;
        ArrayList<Customer> customersList = new ArrayList<Customer>();
        try{
            Class.forName(Keys.DRIVER);
            connection = DriverManager.getConnection(Keys.URL,Keys.USERNAME,Keys.PASSWORD);
            getQuery=connection.prepareStatement(Keys.SELECT_ALL_QUERY);
            ResultSet resultSet=getQuery.executeQuery();
            resultSet.next();
            do {
                Customer customer = new Customer();
                customer.setId(resultSet.getInt(0));
                customer.setName(resultSet.getString(1));
                customer.setAge(resultSet.getInt(2));
                customer.setContact(resultSet.getString(3));
                customer.setNationality(resultSet.getString(4));
                customersList.add(customer);
            }while (resultSet.next());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
                getQuery.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return customersList;
    }
    public static Customer getCustomers(int id){
        Connection connection=null;
        PreparedStatement getQuery=null;
        Customer customer = new Customer();
        try{
            Class.forName(Keys.DRIVER);
            connection = DriverManager.getConnection(Keys.URL,Keys.USERNAME,Keys.PASSWORD);
            getQuery=connection.prepareStatement(Keys.SELECT_CUSTOMER_QUERY);
            ResultSet resultSet=getQuery.executeQuery();
            resultSet.next();
            do {
                customer.setId(resultSet.getInt(0));
                customer.setName(resultSet.getString(1));
                customer.setAge(resultSet.getInt(2));
                customer.setContact(resultSet.getString(3));
                customer.setNationality(resultSet.getString(4));
            }while (resultSet.next());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
                getQuery.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return customer;
    }
}
