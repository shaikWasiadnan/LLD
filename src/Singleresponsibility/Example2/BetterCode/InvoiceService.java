package Singleresponsibility.Example2.BetterCode;

public class InvoiceService {
    public void generateInvoice(Order order){
        System.out.println("Generating invoice for items: "+order.getItems());
        System.out.println("Total amount is: "+order.getTotalAmount());
//        Logic for genereting invoice
    }
}
