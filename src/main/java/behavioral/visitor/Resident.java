package behavioral.visitor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Resident extends Customer{

    private final int numberOfPersonalInsurance;

    public Resident(String name, String address, String number, int numberOfPersonalInsurance) {
        super(name, address, number);
        this.numberOfPersonalInsurance = numberOfPersonalInsurance;
    }

    @Override
    public void serviceClient() {
        System.out.println("This is a private individual!");
    }

    @Override
    public void claimInsurance(Visitor vistor) {
        vistor.visitResident(this);
    }
}
