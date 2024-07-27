package Oops.Inheritance;
import java.util.*;
class MotorCar
{
    public String name,model;
    int milage;
    public MotorCar(String name,String model,int milage)
    {
        this.name=name;
        this.model=model;
        this.milage=milage;
    }
    public MotorCar()
    {

    }
    public void printMotorVehicle()
    {
        System.out.println("The name of the car is:"+this.name);
        System.out.println("The model of the car is:"+this.model);
        System.out.println("The milage of the car is:"+this.milage);
    }
}
class Biker extends MotorCar
{
    public int price;
    public String engine_no;
    public Biker(String name,String model,int milage,String engine_no,int price)
    {
        super(name,model,milage);
        this.engine_no=engine_no;
        this.price=price;
    }
    public Biker()
    {

    }
    public void printBike()
    {
        super.printMotorVehicle();
        System.out.println("The engine no of the vehicle is:"+this.engine_no);
        System.out.println("The price of the vehicke is:"+this.price);
        System.out.println();
    }
}
class Car extends MotorCar
{
    public int price;
    public String engine_no;
    public Car(String name,String model,int milage,String engine_no,int price)
    {
        super(name,model,milage);
        this.engine_no=engine_no;
        this.price=price;
    }
    public Car()
    {

    }
    public void printCar()
    {
        super.printMotorVehicle();
        System.out.println("The engine no of the vehicle is:"+this.engine_no);
        System.out.println("The price of the vehicke is:"+this.price);
        System.out.println();
    }
}
public class Hierarchicalinheritance {
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
        MotorCar motorCar = new MotorCar(name,model,milage);
        Biker bike = new Biker(name,model,milage,engine_no,price);
        Car car = new Car(name,model,milage,engine_no,price);
        System.out.println();
        motorCar.printMotorVehicle();;
        System.out.println();
        bike.printBike();
        System.out.println();
        car.printCar();
    }
}
