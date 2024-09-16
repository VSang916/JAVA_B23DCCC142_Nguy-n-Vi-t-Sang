class Common {
    public static boolean isPositive(int number) {
        return number > 0;
    }
}

class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (Common.isPositive(width) && Common.isPositive(height)) {
            this.width = width;
            this.height = height;
        } else {
            throw new IllegalArgumentException("Width và height phai la so nguyen duong.");
        }
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (Common.isPositive(width)) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width phai la so nguyen duong.");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (Common.isPositive(height)) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height phai la so nguyen duong.");
        }
    }
}

class Circle {
    private int radius;

    public Circle(int radius) {
        if (Common.isPositive(radius)) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius phai la so nguyen duong.");
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (Common.isPositive(radius)) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius phai la so nguyen duong.");
        }
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Bai3 {
    public static void main(String[] args) {
        try {
            Circle circle = new Circle(5);
            System.out.println("Chu vi hinh tron: " + circle.getPerimeter());
            System.out.println("Dien tich hinh tron: " + circle.getArea());

            Rectangle rectangle = new Rectangle(4, 7);
            System.out.println("Chu vi hinh chu nhat: " + rectangle.getPerimeter());
            System.out.println("Dien tich hinh chu nhat: " + rectangle.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

