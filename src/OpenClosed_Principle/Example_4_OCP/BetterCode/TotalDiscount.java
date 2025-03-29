package OpenClosed_Principle.Example_4_OCP.BetterCode;

public class TotalDiscount {
    public double discount(DiscountCalculation calculation,double price){
        return calculation.calculateDiscount(price);
    }
}
