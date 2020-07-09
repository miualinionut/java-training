package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge3 {

    public static List<List<Integer>> bellTriangle (int dimension){

        List<List<Integer>> result = new ArrayList<>();
        result.add(0,Arrays.asList(1));

        for(int i = 1; i < dimension; i++){
            List<Integer> aux = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0)
                    aux.add(j, result.get(i-1).get(i-1));
                else aux.add(j, aux.get(j-1) + result.get(i-1).get(j-1) );
            }
            result.add(i,aux);
        }
        return result;
    }

    public static void main(String[] args) {

        List<List<Integer>> testBellTriangle = bellTriangle(5);

        //afisare:
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(testBellTriangle.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }
}
