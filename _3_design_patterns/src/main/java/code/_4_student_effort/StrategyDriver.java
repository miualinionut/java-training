package code._4_student_effort;

import java.util.Arrays;

public class StrategyDriver {

    public static void main (String[] args){
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01ofArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02ofArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSort(), copy01ofArr);
        System.out.println();
        //displaySorted(new MergeSort(), copy02ofArr);

        //TODO: redo merge sort
    }

     static void displaySorted(SortingStrategy strategy, Integer[] arr){
        int i;
        strategy.sort(arr);

        for (i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
