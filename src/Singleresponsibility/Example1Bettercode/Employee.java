package Singleresponsibility.Example1Bettercode;

public class Employee {
    public String name;
    public double salary;
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getname(){
        return name;
    }
    public double getsalary(){
        return salary;
    }

}
