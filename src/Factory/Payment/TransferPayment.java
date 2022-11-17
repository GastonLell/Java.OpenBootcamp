package Factory.Payment;

public class TransferPayment implements Payment{


    @Override
    public void configurePayment(String amountNumber, int quantity) {
        System.out.println("Configurando pago... " + "Numero de cuenta: " + amountNumber + " Pago total de: " + quantity);

    }

    @Override
    public void configurePayment(String amountNumber, int installments, int quantity) {

    }

    @Override
    public boolean makePayment() {
        return false;
    }

    @Override
    public void getTicket() {

    }
}
