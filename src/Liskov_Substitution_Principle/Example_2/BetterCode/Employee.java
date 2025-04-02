package Liskov_Substitution_Principle.Example_2.BetterCode;

public abstract class Employee {
    private String name;
    private double salary;
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }


}
