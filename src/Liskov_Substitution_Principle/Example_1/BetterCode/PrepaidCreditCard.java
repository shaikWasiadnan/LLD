package Liskov_Substitution_Principle.Example_1.BetterCode;

public class PrepaidCreditCard extends CreditCard implements Payable{
    private double balance;
    public PrepaidCreditCard(String cardHolderName,String cardNumber,String expiryDate,double balance){
        super(cardHolderName, cardNumber, expiryDate, balance);
        this.balance=balance;
    }



    @Override
    public void makePayment(double amount){
        if(amount>balance){
            throw new IllegalArgumentException("Insufficient amount");
        }
        balance-=amount;
        System.out.println("making payment through Prepaid card of: "+amount);


    }

}
