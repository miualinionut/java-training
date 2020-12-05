package code._4_student_effort.Challenge5;

import code._4_student_effort.Challenge5.AscBubble;
import code._4_student_effort.Challenge5.DescBubble;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        AscBubble asc = new AscBubble();
        asc.sort(copy01OfArr);
        DescBubble desc = new DescBubble();
        desc.sort(copy02OfArr);

        displaySorted(copy01OfArr);
        displaySorted(copy02OfArr);
    }

    public static void displaySorted(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
