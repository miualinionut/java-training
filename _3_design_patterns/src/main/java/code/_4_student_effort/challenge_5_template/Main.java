package code._4_student_effort.challenge_5_template;

import java.util.Arrays;

public class Main {

    public static void displaySorted(Integer[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.println("CODE CHALLENGE 5");

        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        AscBubbleSort asc = new AscBubbleSort();
        asc.sort(copy01OfArr);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(copy02OfArr);

        displaySorted(copy01OfArr);
        displaySorted(copy02OfArr);
    }
}
