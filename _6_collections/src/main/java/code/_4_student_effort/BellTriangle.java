package code._4_student_effort;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;

public class BellTriangle {

    public static List<List<Integer>> printBell(int n){
        List<List<Integer>> Bell = new ArrayList<>();
        Bell.add(asList(1));

        for(int i = 1; i<n; i++){
            List<Integer>CurrentRow = new ArrayList<>();
            CurrentRow.add(Bell.get(i-1).get(i-1));
            for(int j = 1; j <= i; j++)
                CurrentRow.add(CurrentRow.get(j - 1) + Bell.get(i-1).get(j - 1));
            Bell.add(CurrentRow);
        }
        return Bell;
    }

    public static void main(String[] args){
        List<List<Integer>> BellTriangle = printBell(4);
        for (List<Integer> row : BellTriangle) {
            for (Integer cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
