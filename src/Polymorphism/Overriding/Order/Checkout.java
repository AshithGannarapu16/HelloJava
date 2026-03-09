package Polymorphism.Overriding.Order;

import Polymorphism.Overriding.PaymentCheckout.Payment;

public class Checkout {

    public void setPayment(MakePayement makePayment){
        makePayment.process();

    }
}
