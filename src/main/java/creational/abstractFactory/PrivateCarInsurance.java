package creational.abstractFactory;

public class PrivateCarInsurance implements CarInsurance{
    @Override
    public void insure() {
        System.out.println("Car insured by private organization");
    }
}
