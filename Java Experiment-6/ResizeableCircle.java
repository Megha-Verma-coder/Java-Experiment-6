public interface GeometricObject {
    double getPerimeter();
    double getArea();
}

public interface Resizable {
    void resize(int percent);
}

public class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

   
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius); 
    }

    
    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }

    
    public double getPerimeter() {
        return super.getPerimeter();
    }

 
    public double getArea() {
        return super.getArea();
    }
}