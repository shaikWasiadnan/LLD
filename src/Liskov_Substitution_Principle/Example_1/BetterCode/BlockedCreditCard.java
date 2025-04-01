package Liskov_Substitution_Principle.Example_1.BetterCode;

public class BlockedCreditCard extends CreditCard{
    public BlockedCreditCard(String cardHolderName, String cardNumber, String expiryDate, double creditLimit) {
        super(cardHolderName, cardNumber, expiryDate, creditLimit);
    }

}
