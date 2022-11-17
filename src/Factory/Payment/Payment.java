package Factory.Payment;

public interface Payment {
    String SUCCESS = "Successful payment";
    String ERROR = "Payment could not be made";

    void configurePayment(String amountNumber, int quantity);

    void configurePayment(String amountNumber, int installments, int quantity);

    boolean makePayment();
    void getTicket();
}
