import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main (String args[])
    {
        Integer [] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer [] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer [] copy02OfArr = Arrays.copyOf(arr,arr.length);

        Sort.displaySorted(new BubleSort(),copy01OfArr);
        Sort.displaySorted(new MergeSort(),copy02OfArr);


    }
}
