//package IntroToThreads;
//
//public class Client {
//    static void main() {
//        System.out.println(Thread.currentThread().getName());
//        Runnable task=new HelloWorldPrinter();
//        Thread t1=new Thread(task);
//        t1.start();
//
//
//
//        Runnable task1=new NumberPrinter();
//        Thread t2=new Thread(task1);
////        t2.start();
//
//
//        for(int i=1;i<=100;i++) {
//            Runnable task2=new NumberPrinterV1(i);
//            Thread t3=new Thread(task2);
//            t3.start();
//
//
//        }
//
//
//    }
//
//
//
//
//
//}
////Thread :Main
////obj of Client class-> Main or class.main
////Task:print a hello world not in the main thread
//
////cpu can pick any thread that's why no sequence threads will run randomly it won't be sequential
//
//
//
