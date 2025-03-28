package Singleresponsibility.Example4_SRP.BetterCode;

public class OrderConfirmationService {
    public void sendOrderConfirmation(ShoppingCart cart) {
        System.out.println("Sending order confirmation email... for item: "+cart.getItems()+ "with total amount: "+cart.getTotalprice());
    }
}
