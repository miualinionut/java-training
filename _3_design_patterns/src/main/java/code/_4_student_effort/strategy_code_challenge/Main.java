package code._4_student_effort.strategy_code_challenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Display of second code challenge (Strategy)
        Integer[] arr1 = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr1, arr1.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr1, arr1.length);

        displaySorted(new BubbleSort(), copy01OfArr);
        displaySorted(new MergeSort(), copy02OfArr);
    }

    static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        strategy.sort(arr);
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
