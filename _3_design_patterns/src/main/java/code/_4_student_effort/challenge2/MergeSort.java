package code._4_student_effort.challenge2;

public class MergeSort implements SortingStrategy {

    private void merge(Integer[] arr, int l, int m, int r){
        int len1 = m-l+1;
        int len2 = r-m;

        Integer[] L = new Integer[len1];
        Integer[] R = new Integer[len2];

        for (int i = 0; i < len1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < len2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < len1 && j < len2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < len1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < len2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort(Integer[] arr, int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public void Sort(Integer[] arr){
        sort(arr,0,arr.length-1);
    }
}

