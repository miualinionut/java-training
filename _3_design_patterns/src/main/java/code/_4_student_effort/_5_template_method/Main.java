package code._4_student_effort._5_template_method;

import code._2_challenge._5_template_method.AscBubleSort;
import code._2_challenge._5_template_method.DescBubleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 8, 3, 6, 15, 9, 7, 13, 2};
        Integer[] copy1 = Arrays.copyOf(arr, arr.length);
        Integer[] copy2 = Arrays.copyOf(arr, arr.length);

        AscBubleSort asc = new AscBubleSort();
        asc.sort(copy1);
        DescBubleSort desc = new DescBubleSort();
        desc.sort(copy2);

        displaySortedArray(copy1);
        displaySortedArray(copy2);
    }

    public static void displaySortedArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
