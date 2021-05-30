package code._4_student_effort.Strategy;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
            int n = list.length;
            int temp = 0;

            for(int i = 0; i < n; i++) {
                for(int j=1; j < (n-i); j++) {
                    if(list[j-1] > list[j]) {
                        temp = list[j-1];
                        list[j-1] = list[j];
                        list[j] = temp;
                    }
                }
            }

    }
}
