package code._4_student_effort._2_strategy;

public class BubbleSort implements SortingStrategy {
    public void sort(Integer[] list) {
        int n = list.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (list[j] > list[j+1]) {
                    // swap list[j+1] and list[j]
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
    }
}
