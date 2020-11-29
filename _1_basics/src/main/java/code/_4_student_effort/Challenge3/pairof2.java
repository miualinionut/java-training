package code._4_student_effort.Challenge3;

public class pairof2 {
    public static int countPairs(Integer[] v) {
        int i, j, number_of_pairs = 0;
        int[] is_in_pair = new int[100];
        int n = v.length;
        for (i = 0; i < n-1; i++) {
            if (is_in_pair[i] == 0) {
                int current = v[i];
                for (j = i+1; j < n; j++)
                    if (v[j] == -current && is_in_pair[j] == 0) {
                        number_of_pairs++;
                        is_in_pair[i] = 1;
                        is_in_pair[j] = 1;
                        break;
                    }
            }
        }
        System.out.println("\n");
        return number_of_pairs;
    }
}
