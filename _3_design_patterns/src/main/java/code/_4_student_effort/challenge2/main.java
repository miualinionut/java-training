package code._4_student_effort.challenge2;


import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        DisplaySorted(new BubbleSort(), copy01OfArr);
        DisplaySorted(new MergeSort(), copy02OfArr);
    }

    public static void DisplaySorted(SortingStrategy strategy, Integer[] list){
        strategy.Sort(list);

        for(int i=0;i<list.length;i++)
            System.out.print(list[i] + " ");

        System.out.println();
    }
}
