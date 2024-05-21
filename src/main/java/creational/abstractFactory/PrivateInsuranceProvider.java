package creational.abstractFactory;

public class PrivateInsuranceProvider extends InsuranceProvider{
    @Override
    public CarInsurance dispatchCarInsurance() {
        return new PrivateCarInsurance();
    }

    @Override
    public HomeInsurance dispatchHomeInsurance() {
        return new PrivateHomeInsurance();
    }
}
