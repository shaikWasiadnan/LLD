package OpenClosed_Principle.Example1_OCP.BetterCode;

public class Premium implements DiscountStrategy{
    @Override
    public double discount(double amount){
        return amount*0.20;
    }
}
