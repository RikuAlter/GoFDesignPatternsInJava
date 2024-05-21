package behavioral.strategy;

public interface PaymentStategy<T> {
    public void collectPaymentInfo(T t);
    public boolean validatePaymentInfo();
    public void payOrder(Long orderTotal);
}
