package ProducerConsumer;

public class Producer implements Runnable  {

    private Store store;

    public Producer(Store store){
        this.store=store;

    }

    @Override
    public void run() {
        produce();
    }

    private  void produce(){
        while(true){
            if(store.getSize()<store.getMaxSize()){
                store.addItem(new Object());
                System.out.println("Produced item , current size of the store :"+store.getSize());

            }


        }
    }
}
