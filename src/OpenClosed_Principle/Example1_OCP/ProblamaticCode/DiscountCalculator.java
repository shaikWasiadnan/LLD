package OpenClosed_Principle.Example1_OCP.ProblamaticCode;



public class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.10; // 10% discount for regular customers
        } else if (customerType.equals("Premium")) {
            return amount * 0.20; // 20% discount for premium customers
        } else {
            return 0; // No discount for others
        }
    }
}

