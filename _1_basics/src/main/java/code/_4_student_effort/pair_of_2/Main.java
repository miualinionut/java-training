package code._4_student_effort.pair_of_2;

public class Main {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{3, 2, -3, -2, 3, 0};
        Integer[] numbers1 = new Integer[]{1, 1, 0, -1, -1};
        Integer[] numbers2 = new Integer[]{5, 9, -5, 7, -5};
        PairOfTwo pairOfTwo = new PairOfTwo();
        System.out.println(pairOfTwo.pairs(numbers2));
    }
}
