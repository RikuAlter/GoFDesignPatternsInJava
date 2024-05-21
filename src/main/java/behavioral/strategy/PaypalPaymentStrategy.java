package behavioral.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaypalPaymentStrategy implements PaymentStategy<PaypalCredentials>{

    private PaypalCredentials paypalCredentials;

    @Override
    public void collectPaymentInfo(PaypalCredentials paypalCredentials) {
        setPaypalCredentials(paypalCredentials);
    }

    @Override
    public boolean validatePaymentInfo() {
        return !getPaypalCredentials().getUserName().isEmpty() && !getPaypalCredentials().getUserPassword().isEmpty();
    }

    @Override
    public void payOrder(Long orderTotal) {
        System.out.println("Paying order total of : "+orderTotal+" with paypal");
    }
}
