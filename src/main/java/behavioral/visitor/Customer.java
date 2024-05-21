package behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Customer {
    protected String name;
    protected String address;
    protected String number;

    public abstract void serviceClient();
    public abstract void claimInsurance(Visitor vistor);
}
