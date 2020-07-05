package code._4_student_effort;

public class BellsTriangle {
    static int[][] bellNumbers(int n) {
        int[][] bell = new int[n + 1][n + 1];
        bell[0][0] = 1;
        bell[1][0] = 1;

        for (int i = 1; i <= n; i++) {
            bell[i][0] = bell[i - 1][i - 1];

            for (int j = 1; j <= i; j++) {
                bell[i][j] = bell[i - 1][j - 1] + bell[i][j - 1];
            }
        }
        return bell;
    }


    public static void main(String[] args) {
        int n = 10;

        int[][] bell;

        bell = bellNumbers(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(bell[i][j] + " ");
            }
            System.out.println();
        }
    }
}
