package code._4_student_effort.mergeLists;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Arrays.sort;

public class MergeLists {
    public boolean checkSorted(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int index1 = 0, index2 = 0;
        while (index1 < list1.size() && index2 < list2.size()) {
            if (list1.get(index1) < list2.get(index2)) {
                mergedList.add(list1.get(index1));
                index1++;
            } else if (list1.get(index1) > list2.get(index2)){
                mergedList.add(list2.get(index2));
                index2++;
            } else {
                mergedList.add(list1.get(index1));
                index1++;
                index2++;
            }
        }

        if (index1 != list1.size()) {
            while (index1 < list1.size()) {
                mergedList.add(list1.get(index1));
                index1++;
            }
        }

        if (index2 != list2.size()) {
            while (index2 < list2.size()) {
                mergedList.add(list2.get(index2));
                index2++;
            }
        }

        return mergedList;
    }

    public static void main(String[] args) {
        MergeLists obj = new MergeLists();
        List<Integer> list1 = asList(1, 2, 3, 4, 5);
        List<Integer> list2 = asList(3, 4, 5, 6, 7, 8, 9, 10);

        if (obj.checkSorted(list1) && obj.checkSorted(list2)) {
            System.out.println(obj.mergeTwoLists(list1, list2));
        }
    }
}
