package Singleresponsibility.Example5_SRP.BetterCode;

public class DataBaseService {
    public void saveToDataBase(StudentManagement student){
        System.out.println("student: "+student.getAllStudents()+"has been saved to DB");
    }
}
