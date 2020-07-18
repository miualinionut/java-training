package code._4_student_effort;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;

public class BellTriangle {
    public static void main(String[] args) {
        List<List<Integer>> triunghi = creare(7);
        for (List<Integer> row : triunghi) {
            for (Integer cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> creare(int n)
    {
        List<List<Integer>> triunghi = new ArrayList<>();
        triunghi.add(asList(1));
        for (int i = 1; i < n; i++) {
            List<Integer> m = triunghi.get(i - 1);
            List<Integer> k = new ArrayList<>();
            k.add(m.get(i - 1));

            for (int j = 1; j <= i; j++)
            {
                k.add(k.get(j - 1) + m.get(j - 1));
            }

            triunghi.add(k);
        }
        return triunghi;
    }

}
