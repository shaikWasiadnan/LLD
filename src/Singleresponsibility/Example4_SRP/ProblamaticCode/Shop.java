package Singleresponsibility.Example4_SRP.ProblamaticCode;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> items;
    private double totalPrice;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addItem(String item, double price) {
        items.add(item);
        totalPrice += price;
    }

    public void removeItem(String item, double price) {
        items.remove(item);
        totalPrice -= price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void processPayment(String paymentType) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Processing credit card payment of: " + totalPrice);
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Processing PayPal payment of: " + totalPrice);
        } else {
            System.out.println("Invalid payment method!");
        }
    }

    public void generateInvoice() {
        System.out.println("Generating invoice for items: " + items + " with total price: " + totalPrice);
    }

    public void sendOrderConfirmation() {
        System.out.println("Sending order confirmation email...");
    }
}

