package Singleresponsibility.Example5_SRP.BetterCode;

public class ReportGeneratorService {
    public void generateReport(StudentManagement student){
        System.out.println("Generating report of : "+student.getAllStudents());
    }
}
