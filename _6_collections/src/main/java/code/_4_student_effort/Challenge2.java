package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge2 {

    public static List<List<Integer>> createPascalTriangle(int dimension){

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(0, new ArrayList<Integer>(Arrays.asList(1) ) );
        for(int i = 1; i < dimension; i++){
            List<Integer> aux = new ArrayList<>();
            aux.add(0,1);

            for(int j = 1; j < i; j++){
                Integer sum = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                aux.add(sum);
            }
            aux.add(i,1);
            triangle.add(i,aux);
        }
        return triangle;
    }

    public static void main(String[] args) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        pascalTriangle = createPascalTriangle(6);

        //afisare:
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(pascalTriangle.get(i).get(j)+ " ");
            }
            System.out.println();
        }

    }
}
