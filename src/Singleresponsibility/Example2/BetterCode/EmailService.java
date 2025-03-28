package Singleresponsibility.Example2.BetterCode;

public class EmailService {
    public void sendConfirmationEmail(Order order){
        System.out.println("Sending confirmation email");
        System.out.println("Your order id: "+order.getOrderId()+" with items: "+order.getItems()+" has total amount to be paid is"+ order.getTotalAmount());
// Logic for email sending
    }
}
