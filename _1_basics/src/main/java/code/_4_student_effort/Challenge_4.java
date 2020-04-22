package code._4_student_effort;

public class Challenge_4 {
    public static int PairOf3(int[] arr) {
        int[] traversed = new int[arr.length];
        int numberOfPairs = 0;

        for (int i = 0; i < traversed.length; i++) {
            traversed[i] = 0;
        }

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k]== 0 && traversed[i] == 0 && traversed[j] == 0 && traversed[k] == 0) {
                        numberOfPairs++;
                        traversed[i] = 1;
                        traversed[j] = 1;
                        traversed[k] = 1;
                    }
                }
            }
        }

        return numberOfPairs;
    }
}
