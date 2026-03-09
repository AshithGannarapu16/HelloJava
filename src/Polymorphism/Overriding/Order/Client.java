package Polymorphism.Overriding.Order;

public class Client {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        MakePayement makePayement = new MakePayement();

        CashOnDelivery cashOnDelivery = new CashOnDelivery();

        GiftCard  giftCard = new GiftCard();

        GiftTOSomeone giftTOSomeone = new GiftTOSomeone();

        Vocher vocher = new Vocher();


        checkout.setPayment(makePayement);
//        checkout.setPayment(cashOnDelivery);
        checkout.setPayment(giftCard);
        checkout.setPayment(giftTOSomeone);
        checkout.setPayment(vocher);



    }
}
