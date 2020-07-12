package code._4_student_effort.challenge2;

public class MergeSort implements SortingStrategy {

    void merge(Integer arr[], int l, int m, int r) {
        int lungime1 = m - l + 1;
        int lungime2 = r - m;

        int L[] = new int[lungime1];
        int R[] = new int[lungime2];

        for (int i = 0; i < lungime1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < lungime2; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;

        while (i < lungime1 && j < lungime2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < lungime1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < lungime2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void mergeSort(Integer arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
        if (l == 0 && r == arr.length - 1) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void sort(Integer[] list) {
        mergeSort(list, 0, list.length - 1);

    }
}
