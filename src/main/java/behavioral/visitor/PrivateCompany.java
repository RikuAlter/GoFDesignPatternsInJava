package behavioral.visitor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PrivateCompany extends Customer{

    private final int numberOfCorporateClaims;

    public PrivateCompany(String name, String address, String number, int numberOfCorporateClaims) {
        super(name, address, number);
        this.numberOfCorporateClaims = numberOfCorporateClaims;
    }

    @Override
    public void serviceClient() {
        System.out.println("This is a private company!");
    }

    @Override
    public void claimInsurance(Visitor vistor) {
        vistor.visitPrivateCompany(this);
    }
}
