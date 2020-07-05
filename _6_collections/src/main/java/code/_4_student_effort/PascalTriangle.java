package code._4_student_effort;

public class PascalTriangle {
    public static int binomialCoefficient(int n, int k) {
        int result = 1;

        if (k > n - k) {
            k = n - k;
        }

        for (int i = 0; i < k; i++) {
            result *=  (n - 1);
            result /= (i + 1);
        }
        return result;
    }

    public static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(7);
    }
}
