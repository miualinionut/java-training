package code._4_student_effort.CodeChallange2;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = generatePascalTriangle(8);
        displayPascalTriangle(triangle);
    }

    public static List<List<Integer>> generatePascalTriangle(int nrRows){
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(asList(1));

        for(int i = 1; i < nrRows; i++){
            triangle.add(new ArrayList<>());
            triangle.get(i).add(1);
            for(int j = 1; j < i; j++){
                Integer nr1 = triangle.get(i - 1).get(j - 1);
                Integer nr2 = triangle.get(i - 1).get(j);
                triangle.get(i).add(nr1 + nr2);
            }
            triangle.get(i).add(1);
        }

        return triangle;
    }

    public static void displayPascalTriangle(List<List<Integer>> triangle){
        for(int i = 0; i < triangle.size(); i++){
            for(int j = 0; j < triangle.get(i).size(); j++){
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
