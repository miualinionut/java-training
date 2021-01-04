package code._4_student_effort._2_pascal;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    int size;
    List<List<Integer>> triangle;
    public PascalsTriangle(int size) {
        this.size = size;
        triangle = new ArrayList<>(size);

    }

    public void printTriangle(){
        for(int i = 0; i < size; i++){
            triangle.add(new ArrayList<>());
            triangle.get(i).add(1);
            for(int j = 1; j < i; j++){
                triangle.get(i).add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
            }
            triangle.get(i).add(1);

        }

        for(int i = 0; i < size; i++){
            for(int k = 0; k < size - i; k++) System.out.print(" ");
            for(int j = 0; j < i + 1; j++){
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
