package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Leaders {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1,3,4,9,5,6,8,11,2);
        System.out.println(findLeaders(array));
    }

    public static List<Integer> findLeaders(List<Integer> array) {
        List<Integer> leaderslist = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            Integer l = array.get(i);
            boolean isLeader = true;
            for (int j = i + 1; j < array.size(); j++) {
                if (l < array.get(j)) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leaderslist.add(l);
            }
        }
        return leaderslist;
    }
}
