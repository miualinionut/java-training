package code._2_challenge._4_pair_of_3;

import code._4_student_effort.Challenge4.pairof3;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Map;

import static java.util.Map.entry;

public class PairOf3Test {
  public static Map<Integer[], Integer> data = Map.ofEntries(
          entry(new Integer[]{-1, -1, -1, 2}, 1),
          entry(new Integer[]{-1, -2, -1, 3, 4, -7, 3}, 2),
          entry(new Integer[]{-1, -1, 3}, 0),
          entry(new Integer[]{-5, -2, 2, 7}, 1)
  );

  @org.junit.Test
  public void test() {
    code._4_student_effort.Challenge4.pairof3 PairOf3 = new pairof3();
    for (Map.Entry<Integer[], Integer> entry : data.entrySet()) {
      Integer[] input = entry.getKey();
      Integer expected = entry.getValue();
      Integer actual = PairOf3.countPairs(input);
      Assert.assertEquals("for input: " + Arrays.asList(input), expected, actual);
    }
  }
}