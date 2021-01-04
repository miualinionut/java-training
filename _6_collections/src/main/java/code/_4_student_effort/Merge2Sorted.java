package code._4_student_effort;

import java.util.*;

public class Merge2Sorted {

    public static List<Integer> Merge2SortedList(List<Integer> arr1, List<Integer> arr2){
        List<Integer> FinalList = new ArrayList<>();
        for (Integer integer : arr1) FinalList.add(integer);
        for (Integer integer : arr2) FinalList.add(integer);
        Collections.sort(FinalList);
        return FinalList;
    }

    public static void main(String[] args){
        List<Integer> arr1 = Arrays.asList(1, 5, 6);
        List<Integer> arr2 = Arrays.asList(2, 3, 4);
        List<Integer> SortedList = Merge2SortedList(arr1,arr2);
        System.out.println(SortedList);

    }

}
