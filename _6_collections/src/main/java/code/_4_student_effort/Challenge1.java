package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Challenge1 {

    public static List<Integer> getLeaders(List<Integer> list){
        List<Integer> leaders = new ArrayList<>();
        boolean isOk;

        for(int i = 0; i < list.size(); i++){
            int potentialLeader = list.get(i);
            isOk = true;
            for(int j = i+1; j<list.size(); j++){
                if(potentialLeader < list.get(j))
                {
                    isOk = false;
                    break;
                }
            }
            if (isOk) leaders.add(potentialLeader);
        }

        return  leaders;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList( new Integer[] {1,2,4,3,6,5,2});
        List<Integer> leaders = getLeaders(list);

        for(Integer item : leaders)
            System.out.println(item);

    }
}
