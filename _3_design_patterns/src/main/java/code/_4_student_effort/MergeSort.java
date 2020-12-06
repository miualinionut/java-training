package code._4_student_effort;
import java.util.Arrays;

public class MergeSort implements SortingStrategy{
    public void sort(Integer[] list){
        int n = list.length;
        int mid = n/2;
        Integer[] l = Arrays.copyOfRange(list, 0, mid);
        Integer[] r = Arrays.copyOfRange(list, mid, list.length);

        sort(l);
        sort(r);

        merge(list,l,r,mid,n-mid);
    }

    public static void merge(Integer[] list, Integer[] l, Integer[] r, int left, int right){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<left && j<right){
            if(l[i] <= r[j]){
                list[k++] = l[i++];
            }
            else{
                list[k++] = r[j++];
            }
        }
        while(i<left){
            list[k++] = l[i++];
        }
        while(j<right){
            list[k++] = r[j++];
        }
    }
}
