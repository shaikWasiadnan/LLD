package Singleresponsibility.Example2.BetterCode;

public class PaymentService {
    public void processPayments(Order order,String paymentMethod){
        System.out.println("Total payment is: "+order.getTotalAmount()+"payment method: "+paymentMethod);
//        Logic for payments processing
    }
}
