package code._4_student_effort.TemplateMethod;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy01OfArr = Arrays.copyOf(arr,arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr,arr.length);

        AscBubleSort asc = new AscBubleSort();
        asc.sort(copy01OfArr);
        DescBubleSort desc = new DescBubleSort();
        desc.sort(copy02OfArr);

        displaySorted(copy01OfArr);
        displaySorted(copy02OfArr);
    }
    public static void displaySorted(Integer[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
