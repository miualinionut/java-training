package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leaders {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2,7,0,2,5);
        System.out.println(getLeaders(integers));
    }

    public static List<Integer> getLeaders(List<Integer> numbers){
        List<Integer> foundLeaders = new ArrayList<>();
        for(int i=0;i<numbers.size(); i++){
           if (checkLeader(numbers.get(i), i, numbers)){
               foundLeaders.add(numbers.get(i));
           }
        }
        return foundLeaders;
    }

    private static boolean checkLeader(Integer number, Integer position, List<Integer> numbers){
        for(int i = position+1;i<numbers.size();i++){
            if (number<numbers.get(i)){
                return false;
            }
        }
        return true;
    }
}
