package code._4_student_effort.bell_triangle;

import java.util.ArrayList;
import java.util.List;

public class BellTriangle {
    public List<List<Integer>> generateBellTriangle(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            triangle.add(new ArrayList<>());
        }

        triangle.get(0).add(1);
        for (int i = 1; i < n; i++) {
            int currentSize = triangle.get(i).size();
            int prevSize = triangle.get(i - 1).size();
            triangle.get(i).add(triangle.get(i - 1).get(prevSize - 1));

            for (int j = 0; j < i; j++) {
                int newNumber = triangle.get(i).get(j) + triangle.get(i - 1).get(j);
                //System.out.println(newNumber);
                triangle.get(i).add(newNumber);
            }
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
        BellTriangle obj = new BellTriangle();
        obj.displayTriangle(obj.generateBellTriangle(5));
    }
}
