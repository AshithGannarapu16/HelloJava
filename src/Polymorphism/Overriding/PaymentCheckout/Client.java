package Polymorphism.Overriding.PaymentCheckout;

public class Client {
        public static void main(String[] args) {

            CheckOutService checkOutService = new CheckOutService();

            Payment payment = new Payment();

            CreditCardPayment creditCardPayment = new CreditCardPayment();

            UPIPayment upiPayment = new UPIPayment();

            GiftCardPayment giftCardPayment = new GiftCardPayment();


            checkOutService.makePayment(payment);
            checkOutService.makePayment(creditCardPayment);
            checkOutService.makePayment(upiPayment);
            checkOutService.makePayment(giftCardPayment);

        }

}
