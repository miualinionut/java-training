package code._4_student_effort;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;




public class PascalsTriangle {
    public static void main(String[] args) {
       afisare(creareTriunghi(5));
    }

    public static List<List<Integer>> creareTriunghi(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(asList(1));

        for (int i = 1; i < n; i++) {
            triangle.add(new ArrayList<>());
            triangle.get(i).add(1);
            for (int j = 1; j < i; j++) {
                Integer upper1 = triangle.get(i - 1).get(j);
                Integer upper2 = triangle.get(i - 1).get(j - 1);
                triangle.get(i).add(upper1 + upper2);
            }
            triangle.get(i).add(1);
        }
        return triangle;
    }

    public static void afisare(List<List<Integer>> triunghi) {
        for (int i = 0; i < triunghi.size(); i++)
        {
            for (int j = 0; j < triunghi.get(i).size(); j++)
            {
                System.out.print(triunghi.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
