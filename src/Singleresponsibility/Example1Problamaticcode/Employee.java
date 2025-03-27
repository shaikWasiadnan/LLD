package Singleresponsibility.Example1Problamaticcode;

public class Employee {

        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public void printDetails() {
            System.out.println("Employee Name: " + name);
            System.out.println("Salary: " + salary);
        }

        public double calculateBonus() {
            return salary * 0.10; // 10% bonus calculation
        }

        public void saveToDatabase() {
            System.out.println("Saving employee data to database...");
            // Database save logic here
        }
    }


