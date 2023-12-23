interface Shape {
    double calculateArea();
}

// Implement the interface in a class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class p17 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double area = circle.calculateArea();

        System.out.println("Area of the circle: " + area);
    }
}
