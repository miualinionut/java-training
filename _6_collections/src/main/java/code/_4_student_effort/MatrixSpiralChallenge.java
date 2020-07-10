package code._4_student_effort;
import java.util.ArrayList;
import java.util.List;

public class MatrixSpiralChallenge {
    public static void main(String[] args) {
        int a[][] =  {{1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}};
        List<Integer> result=  spiralPrint(4, 4, a);
        System.out.println(result);
    }

    public static List<Integer> spiralPrint(int m, int n, int a[][]) {
        List<Integer> result = new ArrayList<>();
        int k = 0;
        int i;
        int l = 0;
        while (k < m && l < n) {

            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;


            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;


            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }


            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
        return result;
    }}
