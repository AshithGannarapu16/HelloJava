package Threads3.Synchronized;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    Count count;
//    Lock lock;

    Adder(Count count) {
        this.count = count;

    }



    @Override
    public Void call() throws Exception {
        for(int i=1;i<=100;i++){
//            lock.lock();
            synchronized (count){
                count.value += i;
            }
//            lock.unlock();
        }
        return null;
    }
}
