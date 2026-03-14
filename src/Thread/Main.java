package Thread;

public class Main {
    static void main() {
//        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(new MyRunnable());

        Thread thread2 = new Thread(new MyRunnable());
        thread1.start();
        thread2.start();
    }
}
