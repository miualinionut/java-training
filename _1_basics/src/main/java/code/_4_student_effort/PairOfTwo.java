package code._4_student_effort;

import java.util.Arrays;

public class PairOfTwo {

    public void findPairsOfTwo(int[] array, int requestedSum) {
        int numberOfPairs = 0;
        int left = 0, right = array.length - 1, sum;
        Arrays.sort(array);
        while (left < right) {
            sum = array[left] + array[right];
            if (sum == requestedSum) {
                numberOfPairs++;
                left++;
                right--;
            } else if (sum < requestedSum) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(numberOfPairs);
    }

}
