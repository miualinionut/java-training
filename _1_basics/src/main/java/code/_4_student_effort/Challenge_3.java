package code._4_student_effort;

public class Challenge_3 {
    public static int PairOf2(int[] arr) {
        int[] traversed = new int[arr.length];
        int numberOfPairs = 0;

        for (int i = 0; i < traversed.length; i++) {
            traversed[i] = 0;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0 && traversed[i] == 0 && traversed[j] == 0) {
                    numberOfPairs++;
                    traversed[i] = 1;
                    traversed[j] = 1;
                }
            }
        }

        return numberOfPairs;
    }
}
