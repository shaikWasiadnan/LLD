package OpenClosed_Principle.Example_3_OCP.BetterCode;

public class Push implements Notification{
    @Override
    public void sending() {
        System.out.println("sending push notification..");
    }
}
