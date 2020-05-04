package code._4_student_effort._5_template_method_code_challenge;

import code._2_challenge._5_template_method.AscBubleSort;
import code._2_challenge._5_template_method.DescBubleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        AscBubleSort asc = new AscBubleSort();
        asc.sort(copy01OfArr);
        DescBubleSort desc = new DescBubleSort();
        desc.sort(copy02OfArr);

        displaySorted(copy01OfArr);
        displaySorted(copy02OfArr);
    }

    static void displaySorted(Integer[] arr) {
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
