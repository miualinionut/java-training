package code._4_student_effort.Strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Integer[] arr = new Integer[]{1, 4, 5 ,2 ,3};

        Integer[] copy1arr = Arrays.copyOf(arr, arr.length);
        Integer[] copy2arr = Arrays.copyOf(arr, arr.length);
        displaySorted(new BubleSort(), copy1arr);
        System.out.println();
        displaySorted(new MergeSort(), copy2arr);


    }
    static void displaySorted(SortingStrategy strategy, Integer[] arr){
        strategy.sort(arr);

        for(Integer i : arr){
            System.out.print(i + " ");
        }

    }

}
