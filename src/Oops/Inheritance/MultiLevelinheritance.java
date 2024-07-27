package Oops.Inheritance;
class Shape {
    String type;

    Shape(String type) {
        this.type = type;
    }

    void display() {
        System.out.println("This is a " + type);
    }
}
class Triangle extends Shape {
    int base;
    int height;

    Triangle(int base, int height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle is: " + area);
    }
}
class EquilateralTriangle extends Triangle {
    int side;

    EquilateralTriangle(int side) {
        super(side, (int) (Math.sqrt(3) / 4 * side * side)); // Height calculation for equilateral triangle
        this.side = side;
    }

    @Override
    void area() {
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of the equilateral triangle is: " + area);
    }

    void display() {
        System.out.println("This is an equilateral triangle with side: " + side);
    }
}

public class MultiLevelinheritance {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 8);
        triangle.display();
        triangle.area();

        EquilateralTriangle eqTriangle = new EquilateralTriangle(10);
        eqTriangle.display();
        eqTriangle.area();
    }
}

