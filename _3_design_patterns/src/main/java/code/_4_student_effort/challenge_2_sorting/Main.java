package code._4_student_effort.challenge_2_sorting;

import java.util.Arrays;

public class Main {
    public static void displaySorted(SortingStrategy strategy, Integer[] arr){
        strategy.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        //--------------Code Challenge 2 ---------------
        System.out.println("CODE CHALLENGE 2");
        Integer[] Arr = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(Arr, Arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(Arr, Arr.length);

        displaySorted(new BubbleSort(), copy01OfArr);
        displaySorted(new MergeSort(), copy02OfArr);

    }
}
