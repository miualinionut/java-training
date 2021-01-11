package code._4_student_effort.strategy;

import java.util.Arrays;

public class MergeSort implements SortingStrategy {

    public void sort(Integer[] list) {
        // algortihm8
        if (list.length < 2) {
            return;
        }
        int middle = list.length / 2;
        Integer[] leftArr = Arrays.copyOfRange(list, 0, middle);
        Integer[] rightArr = Arrays.copyOfRange(list, middle, list.length);

        sort(leftArr);
        sort(rightArr);
        merge(leftArr, rightArr, list);
    }

    private void merge(Integer[] left, Integer[] right, Integer[] list) {
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) < 0) {
                list[listIndex++] = left[leftIndex++];
            } else {
                list[listIndex++] = right[rightIndex++];
            }
        }
        while (leftIndex < left.length) {
            list[listIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            list[listIndex++] = right[rightIndex++];
        }
    }
}
