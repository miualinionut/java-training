package code._4_student_effort.strategy;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {

        for(int i = 0; i < list.length; i++)
            for(int j = 0; j < list.length; j++)

                //bubble sort the array
                if(list[i] < list[j]) {
                    Integer aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }

        for(int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
