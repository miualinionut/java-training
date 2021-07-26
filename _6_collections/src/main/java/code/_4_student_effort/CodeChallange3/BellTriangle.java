package code._4_student_effort.CodeChallange3;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class BellTriangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = generateBellTriangle(5);
        displayBellTriangle(triangle);
    }

    public static List<List<Integer>> generateBellTriangle(int nrRows){
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(asList(1));

        for(int i = 1; i < nrRows; i++){
            int prevSize = triangle.get(i - 1).size();
            Integer prevLastElement = triangle.get(i - 1).get(prevSize - 1);

            triangle.add(new ArrayList<>());
            triangle.get(i).add(prevLastElement);

            for(int j = 0; j < prevSize; j++){
                Integer upperElement = triangle.get(i - 1).get(j);
                Integer currElement = triangle.get(i).get(j);

                triangle.get(i).add(upperElement + currElement);
            }
        }

        return triangle;
    }

    public static void displayBellTriangle(List<List<Integer>> triangle){
        for(int i = 0; i < triangle.size(); i++){
            for(int j = 0; j < triangle.get(i).size(); j++){
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
