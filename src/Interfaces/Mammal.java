package Interfaces;

public class Mammal extends Animal implements Runner{
    @Override
    public void run(){
        System.out.println("Mammal is running");

    }
}
