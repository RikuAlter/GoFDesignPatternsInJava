package creational.abstractFactory;

public class GovenmentInsuranceProvider extends InsuranceProvider{
    @Override
    public CarInsurance dispatchCarInsurance() {
        return new GovernmentCarInsurance();
    }

    @Override
    public HomeInsurance dispatchHomeInsurance() {
        return new GovernmentHomeInsurance();
    }
}
