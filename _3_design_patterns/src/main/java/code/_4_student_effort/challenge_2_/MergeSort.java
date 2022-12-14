package code._4_student_effort.challenge_2_;

public class MergeSort implements SortingStrategy {
    private void merge(Integer[] arr, int left, int middle, int right) {
        int left_arr_size = middle - left + 1;
        int right_arr_size = right - middle;

        Integer[] left_arr = new Integer[left_arr_size];
        Integer[] right_arr = new Integer[right_arr_size];

        for(int i = 0; i < left_arr_size; i++)
            left_arr[i] = arr[left + i];
        for(int i = 0; i < right_arr_size; i++)
            right_arr[i] = arr[middle + 1 + i];

        int i = 0, j = 0, k = left;

        while(i < left_arr_size && j < right_arr_size) {
            if(left_arr[i] <= right_arr[j]) {
                arr[k] = left_arr[i];
                i++;
            } else {
                arr[k] = right_arr[j];
                j++;
            }

            k++;
        }

        while(i < left_arr_size) {
            arr[k] = left_arr[i];
            i++;
            k++;
        }

        while(j < right_arr_size) {
            arr[k] = right_arr[j];
            j++;
            k++;
        }
    }

    private void mergeSort(Integer[] arr, int left, int right) {
        if(left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle +1, right);

            merge(arr, left, middle, right);
        }
    }

    public void sort(Integer[] list) {
        mergeSort(list, 0, list.length - 1);
    }
}
