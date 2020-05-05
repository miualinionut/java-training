package code._4_student_effort.Challenge_2_Strategy;

public class BubbleSort implements SortingStrategy{

    public void sort( Integer[] list) {
        int esortat, i,aux;
        do {
            esortat = 1;
            for (i = 0; i < list.length-1; i++)
                if(list[i]>list[i+1]) {
                    esortat = 0;
                    aux = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = aux;
                }
            }while(esortat==0);
    }

}
