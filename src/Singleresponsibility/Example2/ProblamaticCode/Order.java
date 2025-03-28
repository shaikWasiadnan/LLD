package Singleresponsibility.Example2.ProblamaticCode;
import java.util.ArrayList;
import java.util.List;

class Order {
    private int orderId;
    private List<String> items;
    private double totalAmount;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addItem(String item, double price) {
        items.add(item);
        totalAmount += price;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Items: " + items);
        System.out.println("Total Amount: $" + totalAmount);
    }
}

class OrderProcessor {
    public void processPayment(Order order, String paymentMethod) {
        System.out.println("Processing payment of $" + order.getTotalAmount() + " using " + paymentMethod + "...");
        // Payment gateway integration logic here
    }

    public void generateInvoice(Order order) {
        System.out.println("Generating invoice for Order ID: " + order + "...");
        // Invoice generation logic here
    }

    public void sendConfirmationEmail(Order order) {
        System.out.println("Sending order confirmation email for Order ID: " + order + "...");
        // Email sending logic here
    }
}

