package Polymorphism.Overriding.PaymentCheckout;

public class CreditCardPayment  extends Payment{
    public void process(){
        System.out.println("Processing payment via  CreditCardPayment");
    }
}
