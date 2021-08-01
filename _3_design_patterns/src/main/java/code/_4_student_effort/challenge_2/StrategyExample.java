package code._4_student_effort.challenge_2;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class StrategyExample {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1,4,5,2,3,6,9,8,7};
        Integer[] copy1 = Arrays.copyOf(arr, arr.length);
        Integer[] copy2 = Arrays.copyOf(arr, arr.length);


        displaySorted(new BubbleSort(), copy1);
        displaySorted(new MergeSort(), copy2);


    }

    public static void displaySorted(SortingStrategy strategy, Integer[] arr){
        strategy.sort(arr);

        for(int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println(" ");
}


}
