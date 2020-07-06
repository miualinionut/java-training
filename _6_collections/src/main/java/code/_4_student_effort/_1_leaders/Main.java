package code._4_student_effort._1_leaders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 5, 9, 2, 4, 8, 7, 6); //9,8,7,6 are leaders
        System.out.println(findLeaders(arr));
    }

    public static List<Integer> findLeaders(List<Integer> arr){
        List<Integer> leaders = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            int currentVal = arr.get(i);
            boolean leader = true;
            for(int j = i + 1; j < arr.size(); j++){
                if(currentVal < arr.get(j)){
                    leader = false;
                }
            }
            if(leader == true){
                leaders.add(currentVal);
            }
        }
        return leaders;
    }
}
