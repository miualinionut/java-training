package code._4_student_effort;

public class codeChallenge3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -4, -3, -2, 5, 6, 7};
        int len = 10;
        System.out.println(numOfPairs(arr, len));
    }

    static int numOfPairs(int[] arr, int arrLength) {
        int i, j, pair = 0;

        for(i = 0; i < arrLength - 1; i++) {
            for(j = i; j < arrLength; j++) {
                if (arr[i] + arr[j] == 0)
                    pair++;
            }
        }

        return pair;
    }

}