package code._4_student_effort;

import java.util.Arrays;

public class MergeSort implements SortingStrategy {

    public void sort(Integer[] list) {
        if (list.length < 2) {
            return;
        }


        int mid = list.length / 2;
        Integer[] l = Arrays.copyOfRange(list, 0, mid);
        Integer[] r = Arrays.copyOfRange(list, mid, list.length);
        sort(l);
        sort(r);
        merge(l, r, list);
    }

    private void merge(Integer[] l, Integer[] r, Integer[] list) {
        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length) {
            if (l[i] <= r[j]) {
                list[k++] = l[i++];
            } else {
                list[k++] = r[j++];
            }
        }
        while (i < l.length) {
            list[k++] = l[i++];
        }
        while (j < r.length) {
            list[k++] = r[j++];
        }

    }
}

