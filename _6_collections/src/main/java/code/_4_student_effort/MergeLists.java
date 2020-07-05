package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeLists {

    public static List<Integer> merge(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> merged = new ArrayList<>();
        int i1 = 0, i2 = 0;
        while (i1 < arr1.size() && i2 < arr2.size()) {
            if (arr1.get(i1) < arr2.get(i2)) {
                merged.add(arr1.get(i1));
                i1++;
            } else if (arr1.get(i1) >= arr2.get(i2)) {
                merged.add(arr2.get(i2));
                i2++;
            }
        }

        if (i1 == arr1.size() - 1) {
            for (int i = i2; i < arr2.size(); i++) {
                merged.add(arr2.get(i));
            }
        } else {
            for (int i = i1; i < arr1.size(); i++) {
                merged.add(arr1.get(i));
            }
        }
        return merged;
    }

    public static void main(String[] args) {

        List<Integer> arr1 = Arrays.asList(1, 5, 6, 7, 8, 9);
        List<Integer> arr2 = Arrays.asList(2, 3, 4);

        List<Integer> arr3 = Arrays.asList(1, 5, 6);
        List<Integer> arr4 = Arrays.asList(2, 3, 4);

        List<Integer> merged1 = merge(arr1, arr2);
        List<Integer> merged2 = merge(arr3, arr4);

        System.out.println(merged1);
        System.out.println(merged2);

    }
}
