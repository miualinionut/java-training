package code._4_student_effort;

import java.util.Arrays;

public class MergeSort implements SortingStrategy {
    public static void merge(Integer[] array, Integer[] sub1, Integer[] sub2, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (sub1[i] <= sub2[j]) {
                array[k++] = sub1[i++];
            } else {
                array[k++] = sub2[j++];
            }
        }

        while (i < left) {
            array[k++] = sub1[i++];
        }

        while (j < right) {
            array[k++] = sub2[j++];
        }

    }

    @Override
    public void sort(Integer[] list) {
        if (list.length < 2) {
            return;
        }

        int leftIndex = list[0];
        int rightIndex = list.length;
        int middleIndex = list.length / 2;

        //create temporary arrays by splitting the main array into 2 sub arrays
        Integer[] sub1 = new Integer[middleIndex];
        Integer[] sub2 = new Integer[list.length - middleIndex];

        for (int i = 0; i < middleIndex; i++) {
            sub1[i] = list[i];
            //copy the first half of the array into the first sub array
        }
        for (int i = middleIndex; i < list.length; i++) {
            sub2[i - middleIndex] = list[i];
            //copy the second half of the array into the second sub array
        }

        sort(sub1);
        sort(sub2);

        merge(list, sub1, sub2, middleIndex, list.length - middleIndex);

    }

    public void displaySorted (SortingStrategy strategy, Integer[] arr) {
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
