package code._4_student_effort.Strategy;

import java.util.Arrays;

public class Strategy {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy010Arr = Arrays.copyOf(arr,arr.length);
        Integer[] copy020Arr = Arrays.copyOf(arr,arr.length);

        displaySorted(new Bublesort(),copy010Arr);
        displaySorted(new MergeSort(),copy020Arr);
    }

    public  static void displaySorted(SortingStrategy strategy,Integer[] arr){
        strategy.sort(arr);
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
