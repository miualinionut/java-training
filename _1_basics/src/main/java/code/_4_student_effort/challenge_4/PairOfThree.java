package code._4_student_effort.challenge_4;

public class PairOfThree {
    public int countPairs(int[] arr) {
        int answer = 0, size = arr.length;
        boolean[] taken = new boolean[1000];
        for (int i = 0; i < size; i++) {
            if (taken[i])
                continue;
            boolean foundPair = false;
            for (int j = i + 1; j < size && !foundPair; j++) {
                if (taken[j])
                    continue;
                for (int k = j + 1; k < size; k++) {
                    if (taken[k])
                        continue;
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        taken[i] = taken[j] = taken[k] = true;
                        answer++;
                        foundPair = true;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}