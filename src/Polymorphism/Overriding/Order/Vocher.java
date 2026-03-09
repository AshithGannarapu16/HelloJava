package Polymorphism.Overriding.Order;

public class Vocher extends MakePayement {
    public void process(){
        System.out.println("Process MakePayment via Vocher");
    }
}
