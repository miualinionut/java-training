package code._4_student_effort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeListsChallenge {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(mergeLists(list1, list2));
    }

    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (!(i == list1.size() && j == list2.size())) {
            if (i == list1.size()) {
                for (; j < list2.size(); j++) {
                    list.add(list2.get(j));
                }
            } else if (j == list2.size()) {
                for (; i < list1.size(); i++) {
                    list.add(list1.get(i));
                }
            } else if (list1.get(i) == list2.get(j)) {
                list.add(list1.get(i));
                i++; j++;
            } else if (list1.get(i) < list2.get(j)) {
                list.add(list1.get(i++));
            } else if (list2.get(j) < list1.get(i)) {
                list.add(list2.get(j++));
            }
        }
        return list;
    }
}
