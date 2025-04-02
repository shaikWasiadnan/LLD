package InterfaceSegregationPrinciple.Example_2.BetterCode;

public class Chef implements ICanCook{
    @Override
    public void cookFood() {
        System.out.println("Chef is cooking Food");
    }
}
