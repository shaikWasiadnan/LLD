package Liskov_Substitution_Principle.Example_2.BetterCode;

public class FullTimeEmployee extends Employee implements Bonus{
    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }
}
