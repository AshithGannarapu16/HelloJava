package Threads3.SyncMethods;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {

    Count count;
//    Lock lock;
    Subtractor(Count count){
        this.count = count;
//        this.lock=lock;

    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=100;i++){
////            lock.lock();
//            synchronized (count) {
//                count.value -= i;
////            lock.unlock();
//            }

            count.decrementValueBy(i);
        }
        return  null;
    }
}
