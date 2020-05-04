package code._4_student_effort.tema3.Strategy;

public class MergeSort implements SortingStrategy {

    public static void combina(Integer array[], int start, int mid, int end) {

        int temp[] = new int[end - start + 1];

        int i = start, j = mid+1, k = 0;

        while(i <= mid && j <= end) {
            if(array[i] <= array[j]) {
                temp[k] = array[i];
                k += 1; i += 1;
            }
            else {
                temp[k] = array[j];
                k += 1; j += 1;
            }
        }

        while(i <= mid) {
            temp[k] = array[i];
            k += 1; i += 1;
        }

        while(j <= end) {
            temp[k] = array[j];
            k += 1; j += 1;
        }

        for(i = start; i <= end; i += 1) {
            array[i] = temp[i - start];
        }
    }

    public static void divide(Integer[] array, int left, int right){
        if(left < right){
            int mij = left + (right-left)/2;
            divide(array,left, mij);
            divide(array,mij+1, right);
            combina(array,left,mij,left);
        }
    }


    @Override
    public void sort(Integer[] list) {
        divide(list,0,list.length-1);

    }
}
