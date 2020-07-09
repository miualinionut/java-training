package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Challenge6 {

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
        iterateInSprial(input);
    }

    public static void iterateInSprial(int[][] matrix) {
        HashMap<Integer, Integer> tracker = new HashMap<>(); //aici stocam pt fiecare element din matrice val 0(nu a fost inca afisata) si val 1 ( deja a fost afisata)

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tracker.put(matrix[i][j], 0);
            }
        }
        int k = 0;
        boolean changeDirrection = true; // true pt orizontal si false pt vertical
        boolean leftToRight = true;
        boolean upToDown = true;
        while (!tracker.isEmpty()) {

            if (changeDirrection) {
                if (leftToRight) {
                    int i = 0;
                    int j = 0;
                    while (i < n && j < n) {
                        if (tracker.containsKey(matrix[i][j])) {
                            System.out.print(matrix[i][j] + " ");
                            tracker.remove(matrix[i][j]);
                            j++;
                        }
                    }
                    leftToRight = !leftToRight;
                } else {
                    int i = 0;
                    int j = n - 1;
                    while (i < n && j >= 0) {
                        if (tracker.containsKey(matrix[i][j])) {
                            System.out.print(matrix[i][j] + " ");
                            tracker.remove(matrix[i][j]);
                            j--;
                        }
                    }
                    leftToRight = !leftToRight;
                }
                changeDirrection = !changeDirrection;
            } else {
                if (upToDown) {
                    int i = 0;
                    int j = n - 1;
                    while (i < n && j >= 0) {
                        if (tracker.containsKey(matrix[i][j])) {
                            System.out.print(matrix[i][j] + " ");
                            tracker.remove(matrix[i][j]);
                            j--;
                        }
                    }
                    upToDown = !upToDown;
                } else {
                    int i = n-1;
                    int j = 0;
                    while (i >= 0 && j < n) {
                        if (tracker.containsKey(matrix[i][j])) {
                            System.out.print(matrix[i][j] + " ");
                            tracker.remove(matrix[i][j]);
                            i--;
                        }
                    }
                    upToDown = !upToDown;
                }

            }

        }

    }
}
