package OpenClosed_Principle.Example_2_OCP.BetterCode;

public class Circle implements Shape {
    public  double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
