package code._4_student_effort._2_strategy;

import java.util.Arrays;

public class MergeSort implements SortingStrategy{

    public void sort(Integer[] list) {
        if (list.length < 2) {
            return;
        }
        int mid = list.length / 2;
        Integer[] left = Arrays.copyOfRange(list, 0, mid);
        Integer[] right = Arrays.copyOfRange(list, mid, list.length);

        sort(left);
        sort(right);
        merge(left, right, list);
    }
    public void merge(Integer[] left, Integer[] right, Integer[] list) {
        int l = 0;
        int r = 0;
        int i = 0;

        // Traverse both array
        while (l < left.length && r < right.length) {
            if(left[l] < right[r]) {
                list[i++] = left[l++];
            } else {
                list[i++] = right[r++];
            }
        }

        // Store remaining elements of first array
        while(l < left.length) {
            list[i++] = left[l++];
        }
        // Store remaining elements of second array
        while(r < right.length) {
            list[i++] = right[r++];
        }
    }
}
