package Singleresponsibility.Example3.BetterCode;

public class NotificationService {
    public void sendIssueNotification(Book book) {
        System.out.println("Sending email notification for issuing: " + book.getTitle());
        // Email logic here
    }
}
