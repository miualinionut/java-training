package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersChallenge {

    public static void main(String[] args){
        List<Integer> list =Arrays.asList(3, 5, 9, 2, 4, 8, 7, 6);
        findLeader(list);
    }

    public static void findLeader(List<Integer> list){
        List<Integer> leaders = new ArrayList<>();
        boolean ok = true;
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)<list.get(j))
                    ok=false;
            }
            if(ok==true)
                leaders.add(list.get(i));
        }
        for (Integer item:leaders)
            System.out.println(item.toString());
    }
}
