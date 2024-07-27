package Oops.Abstraction;
import java.security.AlgorithmConstraints;
import java.util.Scanner;
 abstract class Polygn
{
    public abstract double area();
    public abstract double perimeter();
    public void display()
    {
        System.out.println("The area is"+area());
        System.out.println("The perimeter is"+perimeter());
    }
}
class Triangle extends Polygn{
    public double base,height;
    public Triangle(double base,double height)
    {
        this.base=base;
        this.height=height;
    }
    public Triangle()
    {

    }
    @Override
    public double area() {
        return 0.5*base*height;
    }

    @Override
    public double perimeter() {
        return base+height;
    }
}
class Circle extends Polygn{
    public double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle()
    {

    }
    @Override
    public double area() {
        return 3.142*Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2*3.142*radius;
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the dimensions for Triangle ");
        double base=s.nextDouble();
        double height=s.nextDouble();
        Triangle triangle = new Triangle(base,height);
        triangle.display();
        System.out.println("Enter the dimensions for circle ");
        double radius=s.nextDouble();
        Circle circle = new Circle(radius);
        circle.display();
    }
}
