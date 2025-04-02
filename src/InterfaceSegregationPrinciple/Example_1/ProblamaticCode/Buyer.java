package InterfaceSegregationPrinciple.Example_1.ProblamaticCode;

public class Buyer implements IUser{
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        //         Buyer cannot approve products
//        This is imposition of unnecessary method due to violation of ISP
    }

    @Override
    public boolean canModifyProducts() {
        //          Buyer cannot Modify products
//        This is imposition of unnecessary method due to violation of ISP
    }

    @Override
    public boolean canAddProducts() {
        //          Buyer cannot Add products
//        This is imposition of unnecessary method due to violation of ISP
    }
}
