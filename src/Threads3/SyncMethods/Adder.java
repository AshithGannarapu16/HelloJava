package Threads3.SyncMethods;

import java.util.concurrent.Callable;

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
           // synchronized (count){
            count.incrementValueBy(i);
//                count.value += i;
          //  }
//            lock.unlock();
        }
        return null;
    }
}
