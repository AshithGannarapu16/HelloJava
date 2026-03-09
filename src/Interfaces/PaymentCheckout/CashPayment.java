package Interfaces.PaymentCheckout;

public class CashPayment extends Payment {

    @Override
    public void process() {
        System.out.println("Processing payment via  CashPayment");

    }
}
