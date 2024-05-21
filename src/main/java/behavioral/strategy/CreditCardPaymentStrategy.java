package behavioral.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCardPaymentStrategy implements PaymentStategy<CreditCard>{

    private CreditCard cc;

    @Override
    public void collectPaymentInfo(CreditCard cc) {
        setCc(cc);
    }

    @Override
    public boolean validatePaymentInfo() {
        return !getCc().getCardNumber().isEmpty() && !getCc().getDate().isEmpty() && !getCc().getCvv().isEmpty();
    }

    @Override
    public void payOrder(Long orderTotal) {
        System.out.println("Paying order total of: "+orderTotal+" with credit card");
    }
}
