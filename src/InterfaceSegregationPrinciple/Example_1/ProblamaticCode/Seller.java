package InterfaceSegregationPrinciple.Example_1.ProblamaticCode;

public class Seller implements IUser {
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
//         Seller cannot approve products
//        This is imposition of unnecessary method due to violation of ISP

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
