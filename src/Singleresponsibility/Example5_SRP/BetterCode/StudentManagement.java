package Singleresponsibility.Example5_SRP.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private List<String> students;
    public StudentManagement(){
        this.students=new ArrayList<>();
    }
    public void addStudent(String student){
        students.add(student);
    }
    public void removeStudent(String student){
        students.remove(student);
    }
    public List<String> getAllStudents(){
        return students;
    }

}
