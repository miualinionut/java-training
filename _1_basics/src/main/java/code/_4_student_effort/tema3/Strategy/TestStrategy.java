package code._4_student_effort.tema3.Strategy;

import java.util.Arrays;

public class TestStrategy {

    public static void displaySorted(SortingStrategy strategy, Integer[] array){
        strategy.sort(array);
        System.out.println("Vectorul sortat :");
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    public static void main(String[] args) {

        Integer[] arr = new Integer[] {1,4,5,2,3,6,9,8,7};
        Integer[] copy1OfArr = Arrays.copyOf(arr,arr.length);
        Integer[] copy2OfArr = Arrays.copyOf(arr,arr.length);

        displaySorted(new BubbleSort(), copy1OfArr);
        displaySorted(new MergeSort(),copy2OfArr);
    }
}
