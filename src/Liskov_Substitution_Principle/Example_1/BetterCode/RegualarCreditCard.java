package Liskov_Substitution_Principle.Example_1.BetterCode;

public class RegualarCreditCard extends CreditCard implements Payable {

    public RegualarCreditCard(String cardHolderName, String cardNumber, String expiryDate, double creditLimit) {
        super(cardHolderName, cardNumber, expiryDate, creditLimit);
    }


    @Override
    public void makePayment(double amount) {
        System.out.println("Making payment through Regularcreditcard"+amount);
    }
}
