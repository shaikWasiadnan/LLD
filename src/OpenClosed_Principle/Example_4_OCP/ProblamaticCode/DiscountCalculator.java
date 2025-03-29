package OpenClosed_Principle.Example_4_OCP.ProblamaticCode;


public class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.05;  // 5% discount
        } else if (customerType.equals("Premium")) {
            return amount * 0.10;  // 10% discount
        } else if (customerType.equals("VIP")) {
            return amount * 0.20;  // 20% discount
        } else {
            return 0;  // No discount
        }
    }
}
