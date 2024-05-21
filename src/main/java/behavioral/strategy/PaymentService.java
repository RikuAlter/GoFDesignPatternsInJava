package behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class PaymentService {

    private PaymentStategy paymentStategy;

    public <T> void processPayment(final Long orderTotal, final T paymentMethod) {
        paymentStategy.collectPaymentInfo(paymentMethod);
        if(paymentStategy.validatePaymentInfo())
            paymentStategy.payOrder(orderTotal);
    }
}
