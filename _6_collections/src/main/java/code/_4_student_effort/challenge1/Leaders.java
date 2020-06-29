package code._4_student_effort.challenge1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leaders {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 6, 9, 5, 7, 2);
        List<Integer> leaders = findLeaders(list);
        System.out.println(leaders);
    }


    public static List<Integer> findLeaders(List<Integer> list) {

        List<Integer> leaderlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            boolean ok = true;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) ok = false;
            }
            if (ok) {
                leaderlist.add(list.get(i));
            }
        }
        return leaderlist;
    }
}
