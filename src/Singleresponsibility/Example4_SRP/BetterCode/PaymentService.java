package Singleresponsibility.Example4_SRP.BetterCode;

public class PaymentService {
    public void processPayment(ShoppingCart cart,String paymentType){
        if (paymentType.equals("CreditCard")) {
            System.out.println("Processing credit card payment of: " + cart.getTotalprice());
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Processing PayPal payment of: " + cart.getTotalprice());
        } else {
            System.out.println("Invalid payment method!");
        }
    }
}
