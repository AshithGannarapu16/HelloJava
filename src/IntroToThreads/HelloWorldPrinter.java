package IntroToThreads;

public class HelloWorldPrinter implements Runnable {
    //Thread class accepts a Runnable type of object
    //It will contain run()
    //Thread will call this run()


    @Override
    public void run() {
        //whatever you do inside this it will do this executed


        print();
//      print();




    }

    public void print(){
        System.out.println("Hello World From  "+Thread.currentThread().getName());


    }
}


//runnable has created Interface run method

