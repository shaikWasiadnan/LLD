package OpenClosed_Principle.Example_3_OCP.BetterCode;

public class SMS implements Notification{
    @Override
    public void sending() {
        System.out.println("Sending SMS.........");
    }
}
