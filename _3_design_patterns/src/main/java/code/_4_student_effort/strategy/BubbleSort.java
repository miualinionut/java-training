package code._4_student_effort.strategy;

public class BubbleSort implements ISortingStrategy{

    @Override
    public void sort(Integer[] list) {
        for (int i=0; i<list.length-1; i++){
            for (int j=i+1; j<list.length; j++)
                if (list[i]>list[j]){
                    int temp = list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
        }
    }
}
