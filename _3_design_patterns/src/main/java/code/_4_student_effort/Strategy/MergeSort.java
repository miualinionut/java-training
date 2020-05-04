package code._4_student_effort.Strategy;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MergeSort implements SortingStrategy
{


    public void sort(Integer[] list)
    {
        int mid=list[list.length/2];
        int start=list[0];
        int end=list[list.length-1];

        Integer[] aux=new Integer[end-start+1];
        int i=start, j=mid+1,k=0;
        while(i <= mid && j <= end)
        {
            if(list[i] <= list[j])
            {
                aux[k] = list[i];
                k += 1; i += 1;
            }
            else
            {
                aux[k] = list[j];
                k += 1; j += 1;
            }
        }

        while(i <= mid)
        {
            aux[k] = list[i];
            k += 1; i += 1;
        }

        while(j <= end)
        {
            aux[k] = list[j];
            k += 1; j += 1;
        }

        for(i = start; i <= end; i += 1)
        {
            list[i] = aux[i - start];
        }



}


}
