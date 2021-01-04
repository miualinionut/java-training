package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixSpiral {

    public static List<Integer> orderMatrixSpiral(int[][] Matrix){
        List aux = new ArrayList();
        int r1 = 0;
        int r2 = Matrix.length - 1;
        int c1 = 0;
        int c2 = Matrix[0].length - 1;

        while(r1 <= r2 && c1 <= c2){
            for (int c = c1; c <= c2; c++) aux.add(Matrix[r1][c]);
            for (int r = r1 + 1; r <= r2; r++) aux.add(Matrix[r][c2]);
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) aux.add(Matrix[r2][c]);
                for (int r = r2; r > r1; r--) aux.add(Matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return aux;
    }

    public static void main(String[] args){
        int[][] Matrix = {{1,2,3,4}, {12,13,14,5},{11,16,15,6},{10,9,8,7}};
       List<Integer> spiralMatrix = orderMatrixSpiral(Matrix);
       System.out.print(spiralMatrix);

    }
}
