abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 7);
        System.out.println("Rectangle - Chu vi: " + rectangle.getPerimeter());
        System.out.println("Rectangle - Dien tich: " + rectangle.getArea());

        Shape circle = new Circle(5);
        System.out.println("Circle - Chu vi: " + circle.getPerimeter());
        System.out.println("Circle - Dien tich: " + circle.getArea());
    }
}

