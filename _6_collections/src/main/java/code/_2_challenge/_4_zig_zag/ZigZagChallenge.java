package code._2_challenge._4_zig_zag;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class ZigZagChallenge {
  public static void main(String[] args) {
    System.out.println(zigZag(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
  }

  public static List<Integer> zigZag(List<Integer> p_arr) {
    List<Integer> arr = new ArrayList<>(p_arr);
    boolean flag = true;
    Integer temp = 0;
    for (int i = 0; i <= arr.size() - 2; i++) {
      if (flag) /* "<" relation expected */ {
        /* If we have a situation like A > B > C, we get A > B < C by swapping B and C */
        if (arr.get(i) > arr.get(i + 1)) {
          temp = arr.get(i);
          arr.set(i, arr.get(i + 1));
          arr.set(i + 1, temp);
        }
      } else /* ">" relation expected */ { /* If we have a situation like A < B < C, we get A < C > B by swapping B and C */
        if (arr.get(i) < arr.get(i + 1)) {
          temp = arr.get(i);
          arr.set(i, arr.get(i + 1));
          arr.set(i + 1, temp);
        }
      }
      flag = !flag; /* flip flag */
    }
    return arr;
  }
}
