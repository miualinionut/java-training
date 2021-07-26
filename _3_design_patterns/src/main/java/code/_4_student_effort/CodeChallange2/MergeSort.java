package code._4_student_effort.CodeChallange2;

import java.util.Arrays;

public class MergeSort implements SortingStrategy{
    @Override
    public void sort(Integer[] list) {
        if(list.length < 2){
            return;
        }

        int mid = list.length / 2;
        Integer[] left = Arrays.copyOfRange(list, 0, mid);
        Integer[] right = Arrays.copyOfRange(list, mid, list.length);

        sort(left);
        sort(right);
        merge(list, left, right);
    }

    private void merge(Integer[] list, Integer[] left, Integer[] right){
        int listIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length){
            if(left[leftIndex] < right[rightIndex]){
                list[listIndex++] = left[leftIndex++];
            }
            else {
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
