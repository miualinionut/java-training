package code._4_student_effort.challenge_2;

public class BubbleSort implements SortingStrategy{

    public void sort (Integer[] list){

        for(int i = 0; i < list.length; i++)
            for(int j = i + 1; j < list.length; j++)
                if(list[i] > list[j]){
                    Integer temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
    }
}
