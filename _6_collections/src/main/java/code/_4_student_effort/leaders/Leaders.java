package code._4_student_effort.leaders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leaders {
    public static List<Integer> findLeaders(List<Integer> list) {
        List<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leaders.add(list.get(i));
            }
        }

        leaders.add(list.get(list.size() - 1));
        return leaders;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(19);
        list.add(7);
        list.add(3);

        //List<Integer> arr = Arrays.asList(3, 5, 9, 2, 4, 8, 7, 6); //9,8,7,6 are leaders

        System.out.println(findLeaders(list));

    }
}
