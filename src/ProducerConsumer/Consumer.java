package ProducerConsumer;

public class Consumer implements Runnable {

    private  Store store;

    public Consumer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        consume();

    }

    private void consume(){
        while(true){
            if(store.getSize()>0){
                store.removeItem(new Object());
                System.out.println("Consumed item , current size of the store :"+store.getSize());
            }
        }
    }
}
