package code._4_student_effort;

import java.util.Arrays;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int aux = list[j];
                    list[j] = list[j+ 1];
                    list[j + 1] = aux;
                }
            }
        }
    }

    public void displaySorted (SortingStrategy strategy, Integer[] arr) {
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
