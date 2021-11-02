package code._4_student_effort;

import java.util.Scanner;

public class PairOfThree {
    public static int numberOfPairs(int[] v) {
        int numar = 0;
        int[] selectat = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                for (int k = j + 1; k < v.length; k++) {
                    if (selectat[i] == 0 && selectat[j] == 0 && selectat[k] == 0 && v[i] + v[j] + v[k] == 0) {
                        numar++;
                        selectat[i] = selectat[j] = selectat[k] = 1;
                    }
                }

            }
        }
        return numar;
    }

    public static void main(String[] args) {
        int n;
        int[] v;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }
        System.out.println(numberOfPairs(v));
    }
}
