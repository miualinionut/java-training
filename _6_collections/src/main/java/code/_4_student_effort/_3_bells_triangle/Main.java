package code._4_student_effort._3_bells_triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        bellsTriangle(6);
    }

    public static void bellsTriangle(int size){
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int i = 1; i < size; i++){
            List<Integer> prevRow = triangle.get(i-1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(prevRow.get(i-1));
            for(int j = 1; j <= i; j++){
                newRow.add(triangle.get(i-1).get(j-1) + newRow.get(j-1));
            }
            triangle.add(newRow);
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
