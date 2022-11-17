package Factory.Payment;

public class CreditCardPayment implements Payment {


    @Override
    public void configurePayment(String amountNumber, int quantity) {

    }

    @Override
    public void configurePayment(String amountNumber, int installments, int quantity) {
        System.out.println("Configurando pago: " + "Numero de cuenta: " + amountNumber + ". " + installments + " cuotas de: " + quantity / installments);
    }

    @Override
    public boolean makePayment() {
        return false;
    }

    @Override
    public void getTicket() {

    }
}
