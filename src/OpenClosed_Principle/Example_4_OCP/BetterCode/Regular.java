package OpenClosed_Principle.Example_4_OCP.BetterCode;

public class Regular implements DiscountCalculation{
    @Override
    public double calculateDiscount(double price) {
        return price*0.05;
    }
}
