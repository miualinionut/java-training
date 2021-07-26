package code._4_student_effort.CodeChallange6;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpiral {
    public static void main(String[] args) {
        List<List<Integer>> spiralMatrix = generateSpiralMatrix(4);
        displaySpiralMatrix(spiralMatrix);
    }

    public static List<List<Integer>> generateEmptyMatrix(int n){
        List<List<Integer>> emptyMatrix = new ArrayList<>();

        for(int i = 0; i < n; i++){
            emptyMatrix.add(new ArrayList<>());
            for(int j = 0; j < n; j++){
                emptyMatrix.get(i).add(0);
            }
        }

        return  emptyMatrix;
    }

    public static List<List<Integer>> generateSpiralMatrix(int n){
        List<List<Integer>> spiralMatrix = generateEmptyMatrix(n);

        int i = 0;
        int j = 0;

        boolean up = false;
        boolean down = false;
        boolean left = false;
        boolean right = true;

        // right -> down -> left -> up -> right -> ...

        for(int count = 1; count <= n * n; count++){
            spiralMatrix.get(i).set(j, count);

            if(right){
                if(j == n - 1 || spiralMatrix.get(i).get(j + 1) != 0){
                    down = true;
                    right = false;
                    i++;
                }
                else {
                    j++;
                }
            }
            else if(down){
                if(i == n - 1 || spiralMatrix.get(i + 1).get(j) != 0){
                    left = true;
                    down = false;
                    j--;
                }
                else{
                    i++;
                }
            }
            else if(left){
                if(j == 0 || spiralMatrix.get(i).get(j - 1) != 0){
                    up = true;
                    left = false;
                    i--;
                }
                else{
                    j--;
                }
            }
            else if(up){
                if(spiralMatrix.get(i - 1).get(j) != 0){
                    right = true;
                    up = false;
                    j++;
                }
                else{
                    i--;
                }
            }
        }

        return spiralMatrix;
    }

    public static void displaySpiralMatrix(List<List<Integer>> spiralMatrix){
        for(int i = 0; i < spiralMatrix.size(); i++){
            for(int j = 0; j < spiralMatrix.get(i).size(); j++){
                System.out.print(spiralMatrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
