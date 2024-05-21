package creational.abstractFactory;

public class GovernmentHomeInsurance implements HomeInsurance {
    @Override
    public void insure() {
        System.out.println("Home insured by government");
    }
}
