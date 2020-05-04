package code._4_student_effort.challenge2;

import java.util.Arrays;

public class Challenge2Main {

    static void displaySorted(SortingStrategy strategy,Integer[] arr){

        System.out.println("Ati ales metoda: "+ strategy.getClass().getSimpleName());
        strategy.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy01OfArr= Arrays.copyOf(arr,arr.length);
        Integer[] copy02OfArr= Arrays.copyOf(arr,arr.length);

        displaySorted(new BubbleSort(),copy01OfArr);
        displaySorted(new MergeSort(),copy02OfArr);




    }
}
