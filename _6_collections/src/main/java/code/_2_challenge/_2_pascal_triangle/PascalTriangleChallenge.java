package code._2_challenge._2_pascal_triangle;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class PascalTriangleChallenge {

  public static void main(String[] args) {
    displayTriunghi(generatePascalTriangle(8));
  }

  public static List<List<Integer>> generatePascalTriangle(int n) {
    List<List<Integer>> triangle = new ArrayList<>();
    triangle.add(asList(1));

    for (int i = 1; i < n; i++) {
      triangle.add(new ArrayList<>());
      triangle.get(i).add(1);
      for (int j = 1; j < i; j++) {
        Integer upper1 = triangle.get(i - 1).get(j);
        Integer upper2 = triangle.get(i - 1).get(j - 1);
        triangle.get(i).add(upper1 + upper2);
      }
      triangle.get(i).add(1);
    }
    return triangle;
  }

  public static void displayTriunghi(List<List<Integer>> triunghi) {
    for (int i = 0; i < triunghi.size(); i++) {
      for (int j = 0; j < triunghi.get(i).size(); j++) {
        System.out.print(triunghi.get(i).get(j) + " ");
      }
      System.out.println();
    }
  }
}
