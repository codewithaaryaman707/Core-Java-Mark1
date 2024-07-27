package Oops.Encapsulation;
import java.util.*;
public class User {
    String name,username,email,password,phone_no;
    int age;
    public User(String name,int age,String username,String phone_no,String email,String password)
    {
        this.name=name;
        this.age=age;
        this.username=username;
        this.phone_no=phone_no;
        this.email=email;
        this.password=password;
    }
    public User(String name,int age,String username,String phone_no,String email)
    {
        this.name=name;
        this.age=age;
        this.username=username;
        this.phone_no=phone_no;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User()
    {

    }
    public void updateUser(User user)
    {
        this.name=user.name;
        this.age=user.age;
        this.username=user.username;
        this.phone_no=user.phone_no;
        this.email=user.email;
        this.password=user.password;
    }
    public void printUser(User user)
    {
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        User user = new User();
    }
}
