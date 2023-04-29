package code._3_in_class.specializare;

public class AlgoritmSortare extends AlgoritmAbstract {

    void sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++){
                if(sortDirection(arr,i,j)){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    boolean sortDirection(int[] arr, int i, int j){
        return arr[i]>arr[j];
    }
}
