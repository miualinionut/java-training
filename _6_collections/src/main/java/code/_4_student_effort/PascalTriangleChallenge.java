package code._4_student_effort;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class PascalTriangleChallenge {
    public static void main(String[] args) {
        displayTriunghi(generatePascalTriangle(8));
    }

    public static List<List<Integer>> generatePascalTriangle(int n) {
        List<List<Integer>> triunghi = new ArrayList<>();
        triunghi.add(asList(1));

        for (int i = 1; i < n; i++) {
            triunghi.add(new ArrayList<>());
            triunghi.get(i).add(1);
            for (int j = 1; j < i; j++) {
                Integer a = triunghi.get(i - 1).get(j);
                Integer b = triunghi.get(i - 1).get(j - 1);
                triunghi.get(i).add(a + b);
            }
            triunghi.get(i).add(1);
        }
        return triunghi;
    }

    public static void displayTriunghi(List<List<Integer>> triunghi) {
        for (int i = 0; i < triunghi.size(); i++) {
            for (int j = 0; j < triunghi.get(i).size(); j++) {
                System.out.print(triunghi.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

