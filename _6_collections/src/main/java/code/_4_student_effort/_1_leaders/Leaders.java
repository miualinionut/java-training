package code._4_student_effort._1_leaders;

import java.util.ArrayList;
import java.util.List;

public class Leaders {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(15);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(2);

        findLeaders(list);
    }

    public static void findLeaders(List<Integer> list) {
        Integer leader = list.get(list.size() - 1);
        System.out.println(leader + " ");
        for(int i = list.size() - 2; i >= 0; i--) {
            if(list.get(i) > leader) {
                leader = list.get(i);
                System.out.println(leader + " ");
            }
        }
    }
}
