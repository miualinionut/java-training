package code._4_student_effort.challenge3;

import java.util.ArrayList;
import java.util.List;

public class BellTriangle {

    public static List<List<Integer>> createTriangle(int rows){
    List<List<Integer>>Bell=new ArrayList<>();
    Bell.add(new ArrayList<>());
    Bell.get(0).add(1);
    for(int i=1;i<rows;i++){
        Bell.add(new ArrayList<>());
        Bell.get(i).add(Bell.get(i-1).get(i-1));
        for(int j=1;j<i;j++){
            Bell.get(i).add(Bell.get(i-1).get(j-1)+Bell.get(i).get(j-1));
        }
    }
    return Bell;
    }


    public static void main(String[] args) {
        int rows=5;
        List<List<Integer>> Triangle=createTriangle(rows);
        for(int i=0;i<rows;i++){
            System.out.println(Triangle.get(i));
        }
    }
}
