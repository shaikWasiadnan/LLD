package OpenClosed_Principle.Example_2_OCP.ProblamaticCode;

public class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.length * rectangle.breadth;
        } else {
            return 0; // Unsupported shape
        }
    }
}

// Circle class
class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}

// Rectangle class
class Rectangle {
    public double length;
    public double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

