package Threads2.ThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> toSort;
    private ExecutorService executor;

    public Sorter(List<Integer> input, ExecutorService executor) {
        this.toSort = input;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {
        return sort();
    }

    List<Integer> sort() throws Exception {

        if (toSort.size() <= 1) {
            return toSort;
        }

        int mid = toSort.size() / 2;

        List<Integer> left = toSort.subList(0, mid);
        List<Integer> right = toSort.subList(mid, toSort.size());

        Sorter leftSorter = new Sorter(left, executor);
        Sorter rightSorter = new Sorter(right, executor);

        Future<List<Integer>> leftFuture = executor.submit(leftSorter);
        Future<List<Integer>> rightFuture = executor.submit(rightSorter);

        List<Integer> leftSorted = leftFuture.get();
        List<Integer> rightSorted = rightFuture.get();

        return merge(leftSorted, rightSorted);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {

            if (left.get(i) < right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}