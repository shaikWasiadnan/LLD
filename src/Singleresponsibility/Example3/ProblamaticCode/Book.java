package Singleresponsibility.Example3.ProblamaticCode;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
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

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " has been issued.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }

    public void saveToDatabase() {
        System.out.println("Saving book details to database...");
        // Database logic here
    }

    public void sendIssueNotification() {
        System.out.println("Sending email notification for issuing: " + title);
        // Email logic here
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showAllBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Issued: " + book.isIssued());
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("Atomic Habits", "James Clear");

        library.addBook(book1);
        library.addBook(book2);

        book1.issueBook();
        book1.saveToDatabase();
        book1.sendIssueNotification();

        library.showAllBooks();
    }
}

