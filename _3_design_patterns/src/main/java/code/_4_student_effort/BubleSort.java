package code._4_student_effort;


public class BubleSort implements SortingStrategy {
    public void sort(Integer[] list) {
        int n = list.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}


