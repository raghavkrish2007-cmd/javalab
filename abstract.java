abstract class Shape {
    int a, b;

    Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract void printArea();
}

class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void printArea() {
        int area = a * b;
        System.out.println("Area of Rectangle = " + area);
    }
}

class Triangle extends Shape {

    Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle = " + area);
    }
}

class Circle extends Shape {

    Circle(int radius) {
        super(radius, 0);
    }

    void printArea() {
        double area = Math.PI * a * a;
        System.out.println("Area of Circle = " + area);
    }
}

public class Sab {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(8, 6);
        Circle c = new Circle(7);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
