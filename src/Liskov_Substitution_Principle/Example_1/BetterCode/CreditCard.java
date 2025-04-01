package Liskov_Substitution_Principle.Example_1.BetterCode;

public abstract class CreditCard {
    protected String cardHolderName;
    protected String cardNumber;
    protected String expiryDate;
    protected double creditLimit;

    public CreditCard(String cardHolderName, String cardNumber, String expiryDate, double creditLimit) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.creditLimit = creditLimit;
    }
    public void displayCardDetails() {
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Credit Limit: ₹" + creditLimit);
    }

}
