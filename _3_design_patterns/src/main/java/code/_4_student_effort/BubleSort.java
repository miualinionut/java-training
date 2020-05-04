package code._4_student_effort;

public class BubleSort implements SortingStrategy{
    public BubleSort(){

    }
    @Override
    public void sort(Integer[] list) {
        int flag=1;
        while(flag!=0){
            flag=0;
            for (int i = 0; i < list.length-1; i++) {
                if (list[i]>list[i+1]) {
                    flag=1;
                    Integer aux = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = aux;
                }
            }
        }
    }
}

