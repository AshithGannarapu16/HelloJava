package Threads3.SyncMethods;

public class Count {
     int value;

    Count(){
        value = 0;
    }

    synchronized void incrementValueBy(int x){
        this.value+=x;

    }

    synchronized void  decrementValueBy(int x){
        this.value-=x;
    }

}
