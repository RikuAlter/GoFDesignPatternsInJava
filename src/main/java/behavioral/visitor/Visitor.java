package behavioral.visitor;

public interface Visitor {
    public void visitBank(Bank bank);
    public void visitResident(Resident resident);
    public void visitPrivateCompany(PrivateCompany company);
}
