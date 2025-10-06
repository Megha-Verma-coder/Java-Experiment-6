abstract class Shape {
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape {
    void RectangleArea(double length, double breadth) {
        System.out.println("Rectangle Area: " + (length * breadth));
    }

    void SquareArea(double side) {
        System.out.println("Square Area: " + (side * side));
    }

    void CircleArea(double radius) {
        System.out.println("Circle Area: " + (3.14159 * radius * radius));
    }
}

public class TestShape {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.RectangleArea(5, 3);
        obj.SquareArea(4);
        obj.CircleArea(2.5);
    }
}