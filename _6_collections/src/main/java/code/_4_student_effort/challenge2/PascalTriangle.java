package code._4_student_effort.challenge2;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {


    public static List<List<Integer>> createTriangle(int rows){

        List<List<Integer>>Pascal=new ArrayList<>();
        Pascal.add(new ArrayList<>());
        Pascal.get(0).add(1);
        for(int i=1;i<rows;i++){
            Pascal.add(new ArrayList<>());
            Pascal.get(i).add(1);
            for(int j=1;j<i;j++){
                Pascal.get(i).add((Pascal.get(i-1).get(j))+(Pascal.get(i-1).get(j-1)));
            }
            Pascal.get(i).add(1);
        }
        return Pascal;
    }

    public static void main(String[] args) {

        int rows=5;
        List<List<Integer>>Triangle=createTriangle(rows);
        for(int i=0;i<rows;i++){
            System.out.println(Triangle.get(i));
        }
    }
}

