package code._4_student_effort.challenge_1_;

import java.util.ArrayList;
import java.util.List;

public class Leader {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(6);
        list.add(7);
        list.add(3);
        list.add(4);

        firstMethod(list);
        secondMethod(list);
    }

    //Dummy approach: for every element in the list check if every element on the right of the element is smaller
    //than the current element. Time complexity: O(n^2)
    private static void firstMethod(List<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            boolean isLeader = true;

            for(int j = i + 1; j < list.size() && isLeader; j++) {
                if(list.get(i) < list.get(j)) {
                    isLeader = false;
                }
            }

            if(isLeader) {
                System.out.print(list.get(i) + " ");
            }
        }

        System.out.println();
    }

    //Faster approach: we iterate through the list from the end to the beginning(since we know that the last
    //element of the list is a leader by default) and we keep track of the last leader. If an element of the
    //list is bigger than the last leader, then that element is also a leader (all the elements that we
    //iterated through and were smaller than the previous leader are automatically smaller than the value
    //bigger than the last leader). Time complexity: O(n)
    //I created a list of leaders so I can display the leaders from left to right as they appear in the list
    private static void secondMethod(List<Integer> list) {
        List<Integer> leaders = findLeaders(list);

        displayLeaders(leaders);
    }

    private static List<Integer> findLeaders(List<Integer> list) {
        Integer lastLeader = list.get(list.size() - 1);
        List<Integer> leaders = new ArrayList<>();

        leaders.add(lastLeader);

        for(int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) > lastLeader) {
                lastLeader = list.get(i);
                leaders.add(lastLeader);
            }
        }

        return leaders;
    }

    private static void displayLeaders(List<Integer> leaders) {
        for(int i = leaders.size() - 1; i >= 0; i--) {
            System.out.print(leaders.get(i) + " ");
        }

        System.out.println();
    }
}
