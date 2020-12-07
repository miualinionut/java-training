package code._4_student_effort;

public class BubbleSort implements SortingStrategy {


    @Override
    public void sort(Integer[] list){
        int i, j, aux;

        for(i = 0; i < list.length-1; i++){
            for(j = i; j < list.length; j++){
                if (list[i] >  list[j]){
                    aux = list[j];
                    list[j] = list[i];
                    list[i] =  aux;
                }
            }
        }

    }


}
