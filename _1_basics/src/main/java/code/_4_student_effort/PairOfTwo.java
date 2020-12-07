package code._4_student_effort;

public class PairOfTwo {
    PairOfTwo() {};

    public int pairOfTwo(int[] array) {
        int pairCount = 0;

        for (int i = 0; i < array.length; i++) {
            int start = array[i];
            if (array[i + 1] + start == 0) {
                pairCount++;
                break;
            }
        }

        return pairCount;
    }
}
