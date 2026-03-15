package Threads2.ThreadedMergeSort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws Exception {

        List<Integer> list = List.of(8, 1, 2, 9, 6, 3, 7, 5);

        ExecutorService executor = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(list, executor);

        Future<List<Integer>> future = executor.submit(sorter);

        System.out.println(future.get());

//        executor.shutdown();
    }
}