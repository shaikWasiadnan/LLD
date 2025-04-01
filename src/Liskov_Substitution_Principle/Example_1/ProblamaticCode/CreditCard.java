package Liskov_Substitution_Principle.Example_1.ProblamaticCode;

// Base CreditCard class
// Base CreditCard class with common properties and methods
abstract class CreditCard {
    private String cardHolderName;
    private String cardNumber;
    private String expiryDate;
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

    public abstract void makePayment(double amount);
}

// Regular Credit Card
class RegularCreditCard extends CreditCard {
    public RegularCreditCard(String cardHolderName, String cardNumber, String expiryDate, double creditLimit) {
        super(cardHolderName, cardNumber, expiryDate, creditLimit);
    }

    @Override
    public void makePayment(double amount) {
        if (amount > creditLimit) {
            throw new IllegalArgumentException("Payment exceeds credit limit!");
        }
        System.out.println("Payment of ₹" + amount + " from Regular Credit Card processed.");
    }
}

// Prepaid Credit Card
class PrepaidCreditCard extends CreditCard {
    private double balance;

    public PrepaidCreditCard(String cardHolderName, String cardNumber, String expiryDate, double balance) {
        super(cardHolderName, cardNumber, expiryDate, balance);
        this.balance = balance;
    }

    @Override
    public void makePayment(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Payment of ₹" + amount + " from Prepaid Credit Card processed. Remaining balance: ₹" + balance);
    }
}

// Blocked Credit Card
class BlockedCreditCard extends CreditCard {
    public BlockedCreditCard(String cardHolderName, String cardNumber, String expiryDate, double creditLimit) {
        super(cardHolderName, cardNumber, expiryDate, creditLimit);
    }

    @Override
    public void makePayment(double amount) {
        throw new UnsupportedOperationException("This credit card is blocked and cannot process payments!");
    }
}

