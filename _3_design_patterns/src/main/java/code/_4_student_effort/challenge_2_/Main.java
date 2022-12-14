package code._4_student_effort.challenge_2_;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArray = array;
        Integer[] copy02OfArray = array;

        displaySorted(new BubbleSort(), copy01OfArray);
        displaySorted(new MergeSort(), copy02OfArray);
    }

    public static void displaySorted(SortingStrategy sortingStrategy, Integer[] array) {
        sortingStrategy.sort(array);

        for(Integer i:array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}