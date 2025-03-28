package Singleresponsibility.Example3.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> books;
    private DataBaseService dataBaseService;
    private NotificationService notificationService;
    public Library(DataBaseService dataBaseService,NotificationService notificationService){
        this.books=new ArrayList<>();
        this.dataBaseService = dataBaseService;
        this.notificationService=notificationService;
    }
    public void addBook(Book book) {
        books.add(book);
        dataBaseService.saveToDataBase(book);
    }
    public void issueBook(Book book) {
        if (!book.isIssued()) {
            book.setIssued(true);
            System.out.println(book.getTitle() + " has been issued.");
        } else {
            System.out.println(book.getTitle()+ " is already issued.");
        }
    }

    public void returnBook(Book book) {
        if (book.isIssued()) {
            book.setIssued(false);
            System.out.println(book.getTitle() + " has been returned.");
        } else {
            System.out.println(book.getTitle() + " was not issued.");
        }
    }

    public void showAllBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Issued: " + book.isIssued());
        }
    }
}
