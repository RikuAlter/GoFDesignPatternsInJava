package creational.abstractFactory;

public class PrivateHomeInsurance implements HomeInsurance{
    @Override
    public void insure() {
        System.out.println("Home insured by private organization");
    }
}
