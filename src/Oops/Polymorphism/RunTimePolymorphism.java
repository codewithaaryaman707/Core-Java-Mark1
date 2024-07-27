package Oops.Polymorphism;
import java.util.*;
class Shape {
    public String type;

    Shape(String type) {
        this.type = type;
    }

    void display() {
        System.out.println("This is a " + type);
    }
}
class Triangle extends Shape {
    public int base,height;

    Triangle(int base, int height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

//    void area() {
//        double area = 0.5 * base * height;
//        System.out.println("Area of the triangle is: " + area);
//    }
    public double area(int base, int height)
    {
        return (0.5*base*height);
    }
}
class EquilateralTriangle extends Triangle {
    public int side;

    EquilateralTriangle(int side) {
        super(side, (int) (Math.sqrt(3) / 4 * side * side)); // Height calculation for equilateral triangle
        this.side = side;
    }

//    @Override
//    void area() {
//        double area = (Math.sqrt(3) / 4) * side * side;
//        System.out.println("Area of the equilateral triangle is: " + area);
//    }

    void display() {
        System.out.println("This is an equilateral triangle with side: " + side);
    }
    public double area(int side)
    {
        return (1.732*Math.pow(side,2));
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int side=s.nextInt();
        EquilateralTriangle triangle =new  EquilateralTriangle(side);
        System.out.println(triangle.area(side));
    }
}
