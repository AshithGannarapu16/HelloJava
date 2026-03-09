package IntroToThreads;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World");
        print();
    }

    public void print(){
        System.out.println("Hello World from "+Thread.currentThread().getName());
    }
}

//Runnable which has a run method
//run();
