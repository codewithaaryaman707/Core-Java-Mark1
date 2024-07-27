package Oops.Polymorphism;
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
    public Vehicle(String name,String model)
    {
        this.name=name;
        this.model=model;
    }
    public Vehicle()
    {

    }
    public static Vehicle printDetails(String name,String model,int milage)
    {
        System.out.println("The name of the vehicle is:"+name);
        System.out.println("The model-no of the vehicle is:"+model);
        System.out.println("The Vehicle gives "+milage+" milages");
        System.out.println();
        return new Vehicle(name,model,milage);
    }
    public static void printDetails(String name,String model)
    {
        System.out.println("The name of the vehicle is:"+name);
        System.out.println("The model-no of the vehicle is:"+model);
    }
    public static void printDetails(Vehicle vehicle){
        System.out.println("The name of the vehicle is:"+vehicle.name);
        System.out.println("The model-no of the vehicle is:"+vehicle.model);
        System.out.println("The Vehicle gives "+vehicle.milage+" milages");
        System.out.println();
    }
}
public class CompileTimePolyMorphism {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the vehicle");
        String name=s.next();
        System.out.println("Enter the model of the vehicle");
        String model = s.next();
        System.out.println("Enter the milage of the vehicle");
        int milage=s.nextInt();
        Vehicle vehicle1= new Vehicle(name,model,milage);
        Vehicle vehicle2 = new Vehicle(name,model);
        Vehicle.printDetails(vehicle1);
        System.out.println();
        Vehicle.printDetails(name,model,milage);
        System.out.println();
        Vehicle.printDetails(name,model);
        System.out.println();
        Vehicle.printDetails(vehicle2);
    }
}
