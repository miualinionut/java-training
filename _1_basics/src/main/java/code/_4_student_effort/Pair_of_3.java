package code._4_student_effort;

public class Pair_of_3 {
    public static void main(String[] args) {
        int[] array1 = new int[]{-1, -1, -1, 2};
        int pair = 0, i, j, k, n = array1.length;
        int[] v = new int[n];
        for (i = 0; i < n; i++)       //vector de marcaj
            v[i] = 0;
        for (i = 0; i < n - 2; i++) {
            for (j = i + 1; j < n - 1; j++)
                for (k = j + 1; k < n; k++)
                    if (array1[i] + array1[j] + array1[k] == 0)
                        if (v[i] == 0 && v[j] == 0 && v[k] == 0) {
                            pair++;
                            v[i] = 1;
                            v[j] = 1;
                            v[k] = 1;
                        }

        }
        System.out.println(pair);
    }
}
