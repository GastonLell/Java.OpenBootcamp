package Factory.Payment;

public class Main {
    public static void main(String[] args){

        //pago con tarjeta de credito
        PaymentFactory creditPayment = new PaymentFactory("creditCard");
        creditPayment.payment.configurePayment("789456789123" , 6, 60000);

        PaymentFactory transfer1 = new PaymentFactory("Transfer");
        transfer1.payment.configurePayment("789456789123" , 60000);


    }
}
