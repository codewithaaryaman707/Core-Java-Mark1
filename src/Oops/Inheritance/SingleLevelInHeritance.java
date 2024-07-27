package Oops.Inheritance;
import java.util.*;
class Vehicle {
    public String name,model;
    int milage;
    public Vehicle(String name,String model,int milage)
    {
        this.name=name;
        this.model=model;
        this.milage=milage;
    }
    public Vehicle()
    {

    }
    public void printDetails()
    {
        System.out.println("The name of the vehicle is:"+this.name);
        System.out.println("The model-no of the vehicle is:"+this.model);
        System.out.println("The Vehicle gives "+this.milage+" milages");
        System.out.println();
    }
}
class Bike extends Vehicle
{
    public int price;
    public String engine_no;
    public Bike(String name,String model,int milage,String engine_no,int price)
    {
        super(name,model,milage);
        this.engine_no=engine_no;
        this.price=price;
    }
    public Bike()
    {

    }
    public void printBike()
    {
        super.printDetails();
        System.out.println("The engine no of the vehicle is:"+this.engine_no);
        System.out.println("The price of the vehicke is:"+this.price);
        System.out.println();
    }
}
public class SingleLevelInHeritance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the vehicle");
        String name = s.next();
        System.out.println("Enter the model of the vehicle");
        String model = s.next();
        System.out.println("Enter the milage of the vehicle");
        int milage=s.nextInt();
        System.out.println("Enter the engine-no of the vehicle");
        String engine_no=s.next();
        System.out.println("Enter the price of the vehicle");
        int price=s.nextInt();
        System.out.println();
        Vehicle vehicle = new Vehicle(name,model,milage);
        Bike bike = new Bike(name,model,milage,engine_no,price);
        vehicle.printDetails();
        bike.printBike();
    }

}
