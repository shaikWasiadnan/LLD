package Liskov_Substitution_Principle.Example_2.ProblamaticCode;

// Base Employee class
abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus();
}

// Full-time Employee with a bonus calculation
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }
}

// Intern class with different behavior
class Intern extends Employee {
    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        throw new UnsupportedOperationException("Interns do not receive bonuses!");
    }
}

// Vendor class that doesn't fit as an Employee
class Vendor extends Employee {
    public Vendor(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        throw new UnsupportedOperationException("Vendors do not receive bonuses!");
    }
}

