public interface PaymentFactory {
    PaymentMethod createPaymentMethod();
}

class CreditCardFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCard();
    }
}

class PayPalFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPal();
    }
}

class GooglePayFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new GooglePay();
    }
}