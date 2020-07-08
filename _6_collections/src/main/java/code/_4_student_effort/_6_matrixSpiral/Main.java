package code._4_student_effort._6_matrixSpiral;

public class Main {
    public static void main(String[] args) {
        Integer[][] matrix = {{1, 2, 3, 4},
                              {12, 13, 14, 5},
                              {11, 16, 15, 6},
                              {10, 9 ,8 ,7}};
        readMatrix(matrix);
    }

    public static void readMatrix(Integer[][] matrix){
        int k = 0; //index start liniw
        int l = 0; //index start coloana
        int m = 4; //linii
        int n = 4; //coloane

        while(k < m && l < n){
            for(int i = l; i < n; i++){
                System.out.print(matrix[k][i] + " ");
            }
            k++;

            for (int i = k; i < m; ++i) {
                System.out.print(matrix[i][n - 1] + " ");
            }
            n--;

            if (k < m) {
                for (int i = n - 1; i >= l; --i) {
                    System.out.print(matrix[m - 1][i] + " ");
                }
                m--;
            }

            if (l < n) {
                for (int i = m - 1; i >= k; --i) {
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
    }
}
