package code._4_student_effort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        SortService sortService= new SortService();
        Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy = Arrays.copyOf(arr, arr.length);
        SortService.displaySorted(new BubleSort(),copy);
    }
}

