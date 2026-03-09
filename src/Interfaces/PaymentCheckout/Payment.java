package Interfaces.PaymentCheckout;


import java.util.Date;

public abstract class Payment {
    private int paymentId;
    private String paymentName;
    private Date date;
    private int amount;

    public int getAmount(){
        return amount;
    }



    public void process(){
        System.out.println("Processing Payment");
    }
//
//    abstract void process();
}
