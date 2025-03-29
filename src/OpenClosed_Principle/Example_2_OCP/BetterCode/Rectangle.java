package OpenClosed_Principle.Example_2_OCP.BetterCode;

public class Rectangle implements Shape {
    public double length;
    public double breadth;
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public double calculateArea() {
        return this.length*this.breadth;
    }
}
