package behavioral.visitor;

public class InsuranceVisitor implements Visitor{
    @Override
    public void visitBank(Bank bank) {
        System.out.println("Insuring: "+bank);
    }

    @Override
    public void visitResident(Resident resident) {
        System.out.println("Insuring: "+resident);
    }

    @Override
    public void visitPrivateCompany(PrivateCompany company) {
        System.out.println("Insuring: "+company);
    }
}
