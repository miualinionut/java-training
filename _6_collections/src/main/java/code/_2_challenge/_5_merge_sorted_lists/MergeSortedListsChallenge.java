package code._2_challenge._5_merge_sorted_lists;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class MergeSortedListsChallenge {

  public static void main(String[] args) {
    List<Integer> list1 = asList(1, 2, 3, 4, 5);
    List<Integer> list2 = asList(3, 4, 5, 6, 7, 8, 9, 10);

    System.out.println(merge(list1, list2));
  }

  public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
    List<Integer> list = new ArrayList<>();
    int i1 = 0;
    int i2 = 0;
    while (!(i1 == list1.size() && i2 == list2.size())) {
      if (i1 == list1.size()) {
        for (; i2 < list2.size(); i2++) {
          list.add(list2.get(i2));
        }
      } else if (i2 == list2.size()) {
        for (; i1 < list1.size(); i1++) {
          list.add(list1.get(i1));
        }
      } else if (list1.get(i1) == list2.get(i2)) {
        list.add(list1.get(i1));
        i1++;
        i2++;
      } else if (list1.get(i1) < list2.get(i2)) {
        list.add(list1.get(i1++));
      } else if (list1.get(i1) > list2.get(i2)) {
        list.add(list2.get(i2++));
      }
    }
    return list;
  }
}
