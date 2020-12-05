package code._4_student_effort.Challenge2;

import java.util.Arrays;

public class MergeSort implements SortingStrategy{
    public void sort(Integer[] arr) {
        if(arr.length < 2)
            return;

        int mid = arr.length/2;
        Integer[] arrLeft = Arrays.copyOfRange(arr, 0, mid);
        Integer[] arrRight = Arrays.copyOfRange(arr, mid, arr.length);

        sort(arrLeft);
        sort(arrRight);
        merge(arrLeft, arrRight, arr);
    }

    public void merge(Integer[] arrLeft, Integer[] arrRight, Integer[] arr) {
        int i = 0, j = 0, k = 0;
        while (i < arrLeft.length && j < arrRight.length) {
            if (arrLeft[i] <= arrRight[j]) {
                arr[k++] = arrLeft[i++];
            }
            else {
                arr[k++] = arrRight[j++];
            }
        }
        while (i < arrLeft.length) {
            arr[k++] = arrLeft[i++];
        }
        while (j < arrRight.length) {
            arr[k++] = arrRight[j++];
        }
    }
}
