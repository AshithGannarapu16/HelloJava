package IntroToThreads;

public class Client {
    static void main() {
        System.out.println(Thread.currentThread().getName());

        HelloWorldPrinter task = new HelloWorldPrinter();
        Thread t1=new Thread(task);
        t1.start();

    }
}

