package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> pascalTriangle = generate(5);

        for(int i =0; i<pascalTriangle.size();i++){
                System.out.println(pascalTriangle.get(i));
        }
    }

    public static List<List<Integer>> generate (int numRows){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> previous = new ArrayList<>();
        for (int i =0; i<numRows;i++){
            List<Integer> currentLine = new ArrayList<>();
            result.add(currentLine);
            int previousValue =0;
            for(int el : previous){
               currentLine.add(el + previousValue);
               previousValue = el;
            }
            currentLine.add(1);
            previous = currentLine;
        }
         return result;
    }
}
