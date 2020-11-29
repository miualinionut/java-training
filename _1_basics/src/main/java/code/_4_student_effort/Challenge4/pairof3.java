package code._4_student_effort.Challenge4;

public class pairof3 {

    public static int countPairs(Integer[] v) {
        int i, j, number_of_pairs = 0;
        int[] is_in_pair = new int[100];
        int n = v.length;
        for (i = 0; i < n - 2; i++) {
            if (is_in_pair[i] == 0) {
                int first = v[i];
                int first_index = i;
                for (j = i + 1; j < n-1; j++) {
                    int second = v[j];
                    int second_index = j;
                    for (int k = j+1; k < n; k++)
                        if (first + second + v[k] == 0 && k != first_index && k != second_index) {
                            if (is_in_pair[k] == 0) {
                                number_of_pairs++;
                                is_in_pair[first_index] = 1;
                                is_in_pair[second_index] = 1;
                                is_in_pair[k] = 1;
                            }
                        }
                }
            }
        }
        return number_of_pairs;
    }
}
