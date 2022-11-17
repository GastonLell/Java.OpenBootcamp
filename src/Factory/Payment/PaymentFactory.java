package Factory.Payment;

public class PaymentFactory {
    Payment payment;

    private PaymentFactory() {};

    public PaymentFactory(String type) {
        if(type.equalsIgnoreCase("CreditCard")){
            this.payment = new CreditCardPayment();
        } else if(type.equalsIgnoreCase("Transfer")){
            this.payment = new TransferPayment();
        }
    }
}
