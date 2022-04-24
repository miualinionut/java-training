package code._4_student_effort.Strategy;

public class BubleSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        for(int i=0;i<list.length-1;i++){
            for(int j=i+1;j< list.length;j++){
                if(list[i].compareTo(list[j])>0){
                    Integer temp=list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
            }
        }
    }
}
