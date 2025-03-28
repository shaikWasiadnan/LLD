package Singleresponsibility.Example3.BetterCode;

public class DataBaseService {
    public void saveToDataBase(Book book){
        System.out.println("Saving book "+book.getTitle()+" to DB");
//        Logic for saving to database
    }
}
