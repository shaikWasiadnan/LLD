package Singleresponsibility.Example2.BetterCode;

public class OrderProcessorService {
    private PaymentService paymentService;
    private InvoiceService invoiceService;
    private EmailService emailService;
    public OrderProcessorService(PaymentService paymentService,InvoiceService invoiceService,EmailService emailService){
        this.paymentService=paymentService;
        this.invoiceService=invoiceService;
        this.emailService=emailService;
    }
    public void ProcessOrder(Order order,String paymentType){

        paymentService.processPayments(order,paymentType);
        invoiceService.generateInvoice(order);
        emailService.sendConfirmationEmail(order);


    }

}
