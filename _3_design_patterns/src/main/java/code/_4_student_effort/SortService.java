package code._4_student_effort;

public class SortService {
    private SortingStrategy strategy;
    private Integer[] arr;

    public static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        strategy.sort(arr);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

}