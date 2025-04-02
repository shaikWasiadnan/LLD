package InterfaceSegregationPrinciple.Example_2.BetterCode;

public class Waiter implements ICanServe,ICanClean{
    @Override
    public void clean() {
        System.out.println("Waiter can serve clean");
    }

    @Override
    public void serve() {
        System.out.println("waiter can serve food");

    }
}
