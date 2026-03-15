package Threads2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Runnable task=new HelloWorldPrinter();
        Thread t1=new Thread(task);
        t1.start();



        Runnable task1=new NumberPrinter();
        Thread t2=new Thread(task1);
//        t2.start();


//        for(int i=1;i<=100;i++) {
//            Runnable task2=new NumberPrinterV1(i);
//            Thread t3=new Thread(task2);
//            t3.start();
//
//
//        }



//
//    ExecutorService  executorService=Executors.newFixedThreadPool(10);

        ExecutorService executorService=Executors.newCachedThreadPool();
//        for(int i=1;i<=100;i++){
//            Runnable task4=new NumberPrinterV1(i);
//            executorService.execute(task4);
//
//        }



        NumberGenerator numberGenerator=new NumberGenerator(6);
        Future<Integer> ansFuture=executorService.submit(numberGenerator);
        System.out.println("Doing something");
        System.out.println("Doing something else");
        System.out.println("Doing something else");
//        Integer ans=ansFuture.get();
//        System.out.println(ans);



    }





}
//Thread :Main
//obj of Client class-> Main or class.main
//Task:print a hello world not in the main thread

//cpu can pick any thread that's why no sequence threads will run randomly it won't be sequential



