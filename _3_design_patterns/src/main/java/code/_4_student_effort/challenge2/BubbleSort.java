package code._4_student_effort.challenge2;

public class BubbleSort implements SortingStrategy {

    public void Sort(Integer[] list) {

        for(int i = 0;i<list.length-1;i++){
            for(int j = 0; j<list.length-i-1;j++){
                if(list[j] > list[j+1]){
                    int aux = list[j];
                    list[j] = list[j+1];
                    list[j+1] = aux;
                }
            }
        }
    }

}
