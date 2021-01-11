package code._4_student_effort.strategy;
import java.util.Arrays;

public class Sort {
    public void displaySorted(SortingStrategy strategy, Integer[] arr) {
        strategy.sort(arr);

        System.out.print("Sorted array: ");
        for (Integer number : arr) {
            System.out.print(number + " ");
        }
        System.out.println(" <- " + strategy.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copyOfArr1 = Arrays.copyOf(arr, arr.length);
        Integer[] copyOfArr2 = Arrays.copyOf(arr, arr.length);

        Sort sortArray = new Sort();
        sortArray.displaySorted(new BubbleSort(), copyOfArr1);
        sortArray.displaySorted(new MergeSort(), copyOfArr2);

    }
}
