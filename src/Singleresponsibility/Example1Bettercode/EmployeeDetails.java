package Singleresponsibility.Example1Bettercode;

public class EmployeeDetails {
    public void printDetails(Employee employee) {
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Salary: " + employee.salary);
    }
}
