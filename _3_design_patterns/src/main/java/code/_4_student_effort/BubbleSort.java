package code._4_student_effort;

public class BubbleSort implements SortingStrategy {

    @Override
    public void sort(Integer[] arr) {
        int aux;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
