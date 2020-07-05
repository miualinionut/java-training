package code._4_student_effort.challenge2;

public class BubbleSort {

    public class BubbleSort implements SortingStrategy{
    public void sort(Integer[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].compareTo(list[j]) > 0) {
                    Integer temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }}
}
