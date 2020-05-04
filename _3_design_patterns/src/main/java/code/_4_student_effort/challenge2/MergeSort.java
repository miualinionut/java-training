package code._4_student_effort.challenge2;

public class MergeSort implements SortingStrategy{

    public static void merge(
            Integer[] a, Integer[] l, Integer[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
    @Override
    public void sort(Integer[] list) {
        if (list.length < 2) {
            return;
        }
        int mid = list.length / 2;
        Integer[] l = new Integer[mid];
        Integer[] r = new Integer[list.length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = list[i];
        }
        for (int i = mid; i < list.length; i++) {
            r[i - mid] = list[i];
        }
        sort(l);
        sort(r);

        merge(list, l, r, mid, list.length - mid);
    }
}

