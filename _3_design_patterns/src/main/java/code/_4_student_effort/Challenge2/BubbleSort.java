package code._4_student_effort.Challenge2;

public class BubbleSort implements SortingStrategy {

    public void sort(Integer[] arr) {
        int i, j;
        for(i = 0; i < arr.length - 1; i++) {
            for(j = i + 1; j < arr.length ; j++) {
                if(arr[i] > arr[j]) {
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
