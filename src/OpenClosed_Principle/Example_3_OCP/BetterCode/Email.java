package OpenClosed_Principle.Example_3_OCP.BetterCode;

public class Email implements Notification{
    @Override
    public void sending() {
        System.out.println("sending email notification...");
    }
}
