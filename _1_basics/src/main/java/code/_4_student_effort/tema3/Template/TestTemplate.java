package code._4_student_effort.tema3.Template;

import java.util.Arrays;

public class TestTemplate {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy1OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy2OfArr = Arrays.copyOf(arr, arr.length);

        AscBubbleSort asc = new AscBubbleSort();
        asc.sort(copy1OfArr);

        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(copy2OfArr);

        printSortedArray(copy1OfArr);
        printSortedArray(copy2OfArr);
    }

    public static void printSortedArray(Integer[] list){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
