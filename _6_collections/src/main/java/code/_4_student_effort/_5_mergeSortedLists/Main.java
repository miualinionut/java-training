package code._4_student_effort._5_mergeSortedLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static List<Integer> mergeList(List<Integer> list1, List<Integer> list2){
        List<Integer> finalList = new ArrayList<Integer>(list1);
        finalList.addAll(list2);
        Collections.sort(finalList);
        return finalList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = asList(1, 2, 3, 4, 5);
        List<Integer> list2 = asList(3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(mergeList(list1, list2));
    }
}
