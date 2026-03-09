package Interfaces.PaymentCheckout;

public class Client {
        public static void main(String[] args) {

            CheckOutService checkOutService = new CheckOutService();

//            Payment payment = new Payment();
            Payment cashPayment=new CashPayment();

            Payment creditCardPayment = new CreditCardPayment();

            Payment upiPayment = new UPIPayment();

            Payment giftCardPayment = new GiftCardPayment();

            checkOutService.makePayment(cashPayment);
            checkOutService.makePayment(creditCardPayment);
            checkOutService.makePayment(upiPayment);
            checkOutService.makePayment(giftCardPayment);

        }

}
