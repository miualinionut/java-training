package code._4_student_effort._2_stratgy;

public class BubbleSort implements SortingStrategy {

    @Override
    public void sort(Integer[] list) {
        for (int i = 0; i < list.length - 1; i++)
            for (int j = 0; j < list.length - i - 1; j++)
                if (list[j] > list[j + 1]) {
                    list[j] = list[j] + list[j + 1];
                    list[j + 1] = list[j] - list[j + 1];
                    list[j] = list[j] - list[j + 1];
                }
    }
}
