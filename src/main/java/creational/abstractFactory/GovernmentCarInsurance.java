package creational.abstractFactory;

public class GovernmentCarInsurance implements CarInsurance {

    @Override
    public void insure() {
        System.out.println("Car insured by government");
    }
}
