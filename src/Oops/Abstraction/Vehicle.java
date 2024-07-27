package Oops.Abstraction;
public interface Vehicle {
    public int milage();
    public int noOfKm();
}
interface Store extends Vehicle
{
    public  void printDetails(Store store);
}
class Car implements Store{
    public int noTyres,milage;
    public String name,model;
    public Car(String name,String model,int noTyres,int milage)
    {
        this.name=name;
        this.model=model;
        this.noTyres=noTyres;
        this.milage=milage;
    }
    public Car()
    {

    }
    @Override
    public int milage() {
        return this.milage;
    }

    @Override
    public int noOfKm() {
        return this.noTyres*100;
    }

    @Override
    public void printDetails(Store store) {
        System.out.println();
    }
}
class Bike implements Store{
    public int noTyres,milage;
    public String name,model;
    public Bike(String name,String model,int noTyres,int milage)
    {
        this.name=name;
        this.model=model;
        this.noTyres=noTyres;
        this.milage=milage;
    }
    public Bike()
    {

    }
    @Override
    public int milage() {
        return this.milage;
    }

    @Override
    public int noOfKm() {
        return this.noTyres*100;
    }

    @Override
    public void printDetails(Store store) {
    }
}