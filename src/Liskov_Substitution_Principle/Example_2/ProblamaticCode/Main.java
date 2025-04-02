package Liskov_Substitution_Principle.Example_2.ProblamaticCode;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Adnan", 50000);
        System.out.println("Bonus for Full-time Employee: ₹" + emp1.calculateBonus());

        Employee emp2 = new Intern("Rahul", 20000);
        System.out.println("Bonus for Intern: ₹" + emp2.calculateBonus());  // 🚨 This will cause runtime error!

        Employee vendor = new Vendor("Tech Solutions", 60000);
        System.out.println("Bonus for Vendor: ₹" + vendor.calculateBonus());  // 🚨 This will also cause runtime error!
    }
}
