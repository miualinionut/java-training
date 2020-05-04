package code._4_student_effort.Strategy;

public class BubleSort implements SortingStrategy{

    public void sort(Integer[] list) {
        for (int i = 0; i < list.length; i++)
            for (int j = 0; j< list.length; j++)
                if(list[i]<list[j])
                {
                    Integer aux = list[i];
                    list[i]=list[j];
                    list[j]=aux;
                }
    }
}
