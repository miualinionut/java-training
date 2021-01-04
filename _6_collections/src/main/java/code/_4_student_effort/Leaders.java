package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leaders {

    public static List<Integer> ListLeader(List<Integer> MyList){
        List<Integer> MyLeadersList = new ArrayList<>();
        boolean ok = false;
        for(int i = 0;  i < MyList.size(); i++){
            for(int j = i+1; j< MyList.size(); j++) {
                if (MyList.get(i) > MyList.get(j))
                    ok = true;
                else
                    ok = false;
            }
            if(ok) MyLeadersList.add(MyList.get(i));
        }
        return MyLeadersList;
    }

    public static void main(String[] args) {
        List<Integer> MyList = Arrays.asList(3, 5, 9, 2, 4, 8, 7, 6);
        System.out.println(ListLeader(MyList));
    }
}
