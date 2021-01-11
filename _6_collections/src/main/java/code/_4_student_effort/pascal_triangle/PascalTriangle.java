package code._4_student_effort.pascal_triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generatePascalTriangle(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            triangle.add(new ArrayList<>());
        }

        triangle.get(0).add(1);

        for (int i = 1; i < n; i++) {
            triangle.get(i).add(1);
            for (int j = 1; j < i; j++) {
                List<Integer> lastLine = triangle.get(i - 1);
                triangle.get(i).add(lastLine.get(j - 1) + lastLine.get(j));
            }
            triangle.get(i).add(1);
        }
        return triangle;
    }

    public void displayTriangle(List<List<Integer>> triangle) {
        for (List<Integer> currentLine : triangle) {
            for (Integer currentValue : currentLine) {
                System.out.print(currentValue + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PascalTriangle obj = new PascalTriangle();
        obj.displayTriangle(obj.generatePascalTriangle(10));
    }
}
