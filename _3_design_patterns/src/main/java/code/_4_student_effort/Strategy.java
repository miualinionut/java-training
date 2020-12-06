package code._4_student_effort;
import java.util.Arrays;

public class Strategy {

    public static void displaySorted(SortingStrategy strategy, Integer[] arr){
        strategy.sort(arr);

        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
            System.out.println();
        }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubleSort(), copy01OfArr);
        displaySorted(new MergeSort(),copy02OfArr);
    }
}
