package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class challenge1 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3,5,9,2,4,8,7,6);
        printLeaders(arr);
    }

    private static void printLeaders(List<Integer> arr){

        List<Integer> leaders = new ArrayList<>();
        int max = arr.get(arr.size()-1);
        leaders.add(max);

        for(int i = arr.size()-2;i>=0;i--){
            if(arr.get(i) > max){
                max = arr.get(i);
                leaders.add(max);
            }
        }
        System.out.println(leaders);
    }

}
