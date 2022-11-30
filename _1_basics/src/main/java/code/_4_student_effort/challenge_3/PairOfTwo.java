package code._4_student_effort.challenge_3;

public class PairOfTwo {
    public int countPairs(int[] arr) {
        int answer = 0;
        int[] freq = new int[1000];
        for (int it: arr) {
            if (it >= 0)
                freq[it]++;
            else if (freq[-it] > 0) {
                freq[-it]--;
                answer++;
            }
        }
        return answer;
    }
}
