package Singleresponsibility.Example3.BetterCode;

private String title;
private String author;
public class Book {
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }
    public void setIssued(boolean isIssued){
        this.isIssued=isIssued;
    }



}
