package Threads3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Count count=new Count();
        Lock lock=new ReentrantLock();

        Adder adder=new Adder(count,lock);

        Subtractor subtractor=new Subtractor(count, lock);

        ExecutorService executorService= Executors.newCachedThreadPool();

        Future<Void> res1=executorService.submit(adder);
        Future<Void> res2=executorService.submit(subtractor);

        res2.get();
        res1.get();

        System.out.println(count.value);


    }
}
