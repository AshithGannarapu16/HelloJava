package Threads2;

import java.util.concurrent.Callable;

public class NumberGenerator implements Callable<Integer> {

    private   int number;

    public NumberGenerator(int x) {
        this.number=x;
    }

    @Override
    public Integer call() throws Exception {
        return returnSquare();
    }

    int returnSquare(){
        System.out.println("Thread :"+Thread.currentThread().getName());
        return number*number;
    }
}
