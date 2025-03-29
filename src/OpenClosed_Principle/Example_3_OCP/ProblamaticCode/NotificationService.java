package OpenClosed_Principle.Example_3_OCP.ProblamaticCode;



public class NotificationService {
    public void sendNotification(String type, String message) {
        if (type.equals("Email")) {
            System.out.println("Sending Email: " + message);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS: " + message);
        } else if (type.equals("Push")) {
            System.out.println("Sending Push Notification: " + message);
        } else {
            System.out.println("Invalid notification type!");
        }
    }
}

