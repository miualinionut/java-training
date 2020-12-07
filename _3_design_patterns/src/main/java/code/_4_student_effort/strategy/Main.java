package code._4_student_effort.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy1 = Arrays.copyOf(array, array.length);

        displaySorted(new BubbleSort(), array);
    }

    static void displaySorted(SortingStrategy strategy, Integer[] array) {
        strategy.sort(array);
    }
}
