package InterfaceSegregationPrinciple.Example_1.ProblamaticCode;

public class Admin implements IUser {
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }
}
