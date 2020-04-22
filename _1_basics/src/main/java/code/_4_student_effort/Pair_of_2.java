package code._4_student_effort;

public class Pair_of_2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{5,9,-5,7,-5};
        int pair = 0, i, j, n = array1.length;
        int[] v = new int[n];
        for (i = 0; i < n; i++)       //vector de marcaj
            v[i] = 0;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++)
                if (array1[i] + array1[j] == 0)
                    if (v[i] == 0 && v[j] == 0) {
                        pair++;
                        v[i] = 1;
                        v[j] = 1;
                    }

        }
        System.out.println(pair);
    }
}