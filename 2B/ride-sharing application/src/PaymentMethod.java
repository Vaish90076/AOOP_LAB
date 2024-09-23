// PaymentMethod.java - PaymentMethod interface
public interface PaymentMethod {
    void processPayment(double amount);
}

// CreditCard.java - Concrete Credit Card payment method
class CreditCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// PayPal.java - Concrete PayPal payment method
class PayPal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// GooglePay.java - Concrete GooglePay payment method
class GooglePay implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing GooglePay payment of $" + amount);
    }
}

