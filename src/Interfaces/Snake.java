package Interfaces;

public class Snake extends  Reptile implements  Runner{

    @Override
    public void run(){
        System.out.println("Snake is swirrling");
    }
}
