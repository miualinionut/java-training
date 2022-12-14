package code._4_student_effort.challenge_2_;

public class BubbleSort implements SortingStrategy {
    public void sort(Integer[] list) {
        for(int i = 0; i < list.length - 1; i++) {
            for(int j = i + 1; j < list.length; j++) {
                if(list[i] > list[j]) {
                    Integer aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }
            }
        }
    }
}
