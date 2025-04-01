package Liskov_Substitution_Principle.Example_1.ProblamaticCode;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new RegularCreditCard("Adnan Khan", "1234-5678-9876-5432", "12/27", 50000);
        processPayment(card1, 5000);

        CreditCard card2 = new PrepaidCreditCard("Rahul Sharma", "9876-5432-1234-5678", "10/26", 2000);
        processPayment(card2, 1500);

        CreditCard card3 = new BlockedCreditCard("Priya Singh", "5555-6666-7777-8888", "09/25", 0);
        processPayment(card3, 1000);
    }

    public static void processPayment(CreditCard card, double amount) {
        card.makePayment(amount);
    }
}
