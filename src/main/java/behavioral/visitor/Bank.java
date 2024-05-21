package behavioral.visitor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Bank extends Customer{

    @ToString.Include
    private final int branchesInsured;

    public Bank(String name, String address, String number, int branchesInsured) {
        super(name, address, number);
        this.branchesInsured = branchesInsured;
    }

    @Override
    public void serviceClient() {
        System.out.println("This is a bank to service clients!");
    }

    @Override
    public void claimInsurance(Visitor vistor) {
        vistor.visitBank(this);
    }
}
