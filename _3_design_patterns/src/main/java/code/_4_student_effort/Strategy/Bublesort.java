package code._4_student_effort.Strategy;

public class Bublesort implements SortingStrategy{
    public void sort(Integer[] list){
        for(int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    Integer aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;
                }
            }
        }
    }
}
