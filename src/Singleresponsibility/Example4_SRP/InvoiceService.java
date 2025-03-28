package Singleresponsibility.Example4_SRP;

import Singleresponsibility.Example4_SRP.BetterCode.ShoppingCart;

public class InvoiceService {
    public void generateInvoice(ShoppingCart cart) {
        System.out.println("Generating invoice for items: " + cart.getItems() + " with total price: " + cart.getTotalprice());
    }
}
