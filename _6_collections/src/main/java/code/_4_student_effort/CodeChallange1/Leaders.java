package code._4_student_effort.CodeChallange1;

import java.util.Arrays;
import java.util.List;

public class Leaders {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(3, 5, 9, 2, 4, 8, 7, 6);
        findLeaders(array);
    }

    public static void findLeaders(List<Integer> array){
        for(int i = 0; i < array.size(); i++){
            boolean isLeader = true;
            for(int j = i + 1; j < array.size(); j++){
                if(array.get(i) < array.get(j)){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                System.out.print(array.get(i) + " ");
            }
        }
    }
}
