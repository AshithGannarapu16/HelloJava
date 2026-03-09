package Polymorphism.Overriding.PaymentCheckout;

public class CheckOutService {
    public void makePayment(Payment payment){
        payment.process();

    }

//    public void makePayment(CreditCardPayment creditCardPayment){
//        creditCardPayment.process();
//    }
//
//    public void makePayment(UPIPayment upiPayment){
//        upiPayment.process();
//    }
//
//    public void makePayment(GiftCardPayment giftCardPayment){
//        giftCardPayment.process();
//    }
}
