package Singleresponsibility.Example5_SRP.ProblamaticCode;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private List<String> students;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public void removeStudent(String student) {
        students.remove(student);
    }

    public List<String> getAllStudents() {
        return students;
    }

    public void saveToDatabase() {
        System.out.println("Saving student data to database...");
        // Database save logic here
    }

    public void generateReport() {
        System.out.println("Generating student report...");
        // Report generation logic here
    }

    public void sendEmailNotification(String student) {
        System.out.println("Sending email notification to: " + student);
        // Email sending logic here
    }
}

