package code._4_student_effort.strategy;

public class MergeSort implements ISortingStrategy{
    void merge(Integer[] list, int left, int right){
        int middle = (left+right)/2;
        int s=left;
        int r2=middle+1;
        int[] temp=new int[right-left+1];
        int i=0;
        while (s<=middle && r2<=right){
            if (list[s]<list[r2])
                temp [i++] = list[s++];
            else
                temp [i++]=list[r2++];
        }
        while (s<=middle)
            temp[i++]=list[s++];
        while (r2<=right)
            temp[i++]=list[r2++];
        for (int k=0; k<i; k++)
            list[left+k]=temp[k];
    }
    void mergeSort(Integer[] list, int left, int right){
        if (left<right){
            int middle = (left+right)/2;
            mergeSort(list,left,middle);
            mergeSort(list,middle+1, right);
            merge(list, left, right);
        }
    }
    @Override
    public void sort(Integer[] list){
        mergeSort(list, 0,list.length-1);
    }
}
