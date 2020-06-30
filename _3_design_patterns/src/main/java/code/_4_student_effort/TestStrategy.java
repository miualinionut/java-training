package code._4_student_effort;

import code._2_challenge._2_strategy.BubleSort;

import java.util.Arrays;

public class TestStrategy {

    public void displaySorted(SortingStrategy strategy, Integer [] arr) {
        strategy.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        TestStrategy t = new TestStrategy();
        t.displaySorted(new BubbleSort(), copy01OfArr);
        System.out.println();
        t.displaySorted(new MergeSort(), copy02OfArr);

    }
}
