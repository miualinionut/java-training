package code._4_student_effort.code_challenge_merge_2_sorted_lists;

import java.util.ArrayList;
import java.util.List;

public class MergeApp {

    public static void main(String[] args) {

        // Get 2 sorted lists
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(1);
        list2.add(5);
        list2.add(6);
        merge(list1, list2).forEach(item -> System.out.print(item + " "));
    }

    private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        list1.sort(Integer::compareTo);

        return list1;
    }
}
