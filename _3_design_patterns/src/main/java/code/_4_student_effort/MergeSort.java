package code._4_student_effort;

import java.util.Arrays;

public class MergeSort implements SortingStrategy{



    @Override
    public void sort(Integer[] list) {
        if(list.length<2)
            return;
        int mid = list.length / 2;
        Integer[] left = Arrays.copyOfRange(list, 0, mid);
        Integer[] right = Arrays.copyOfRange(list, mid, list.length);

        sort(left);
        sort(right);
        merge(left, right, list);
    }

    public void merge(Integer[] l, Integer[] r, Integer[] list){
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;

        while (leftIndex < l.length && rightIndex < r.length) {
            if (l[leftIndex].compareTo(r[rightIndex]) < 0) {
                list[listIndex++] = l[leftIndex++];
            } else {
                list[listIndex++] = r[rightIndex++];
            }
        }
        while (leftIndex < l.length) {
            list[listIndex++] = l[leftIndex++];
        }
        while (rightIndex < r.length) {
            list[listIndex++] = r[rightIndex++];
        }
    }
}
