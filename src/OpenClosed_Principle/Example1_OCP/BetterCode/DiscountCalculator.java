package OpenClosed_Principle.Example1_OCP.BetterCode;

public class DiscountCalculator {
    private DiscountStrategy discountStrategy;
    public void DiscountStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy=discountStrategy;
    }
    public double applyDiscount(double amount){
        return discountStrategy.discount(amount);
    }
}
