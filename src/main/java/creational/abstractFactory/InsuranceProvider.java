package creational.abstractFactory;

public abstract class InsuranceProvider {
    public abstract CarInsurance dispatchCarInsurance();
    public abstract HomeInsurance dispatchHomeInsurance();
}
