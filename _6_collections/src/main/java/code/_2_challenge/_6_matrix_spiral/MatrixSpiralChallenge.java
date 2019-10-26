package code._2_challenge._6_matrix_spiral;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpiralChallenge {

  public static void main(String[] args) {
    //List<List<Integer>> b = generateEmptyCubicMatrix(4);
    //displayMatrix(b);

    List<List<Integer>> a = generateSpiralMatrix(6);

    System.out.println("---");
    displayMatrix(a);

    System.out.println("---");
    parseSpiralMatrix(a);
  }

  public static List<List<Integer>> generateEmptyCubicMatrix(int n) {
    List<List<Integer>> a = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      List<Integer> row = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        row.add(0);
      }
      a.add(row);
    }
    return a;
  }

  public static String numberAs4Chars(int n) {
    String formattedNumber = String.format("%4d", n);
    return formattedNumber;

  }

  public static void displayMatrix(List<List<Integer>> a) {
    for (int i = 0; i < a.size(); i++) {
      String row = "";
      for (int j = 0; j < a.size(); j++) {
        row += numberAs4Chars(a.get(i).get(j)) + ", ";
      }
      System.out.println(row);
    }
  }

  public static List<List<Integer>> generateSpiralMatrix(int n) {
    List<List<Integer>> a = generateEmptyCubicMatrix(n);
    Integer value = 1;
    for (int step = 0; step < n / 2; step++) {
      for (int r1 = step; r1 < n - step; r1++) {
        a.get(step).set(r1, value++);
      }
      for (int c1 = step + 1; c1 < n - step; c1++) {
        a.get(c1).set(n - step - 1, value++);
      }
      for (int r2 = n - step - 1 - 1; r2 >= step; r2--) {
        a.get(n - step - 1).set(r2, value++);
      }
      for (int c2 = n - step - 1 - 1; c2 >= step + 1; c2--) {
        a.get(c2).set(step, value++);
      }
    }
    return a;
  }

  public static void parseSpiralMatrix(List<List<Integer>> a) {
    String s = "";
    Integer n = a.size();
    for (int step = 0; step < n / 2; step++) {
      for (int r1 = step; r1 < n - step; r1++) {
        s += a.get(step).get(r1) + ", ";
      }

      for (int c1 = step + 1; c1 < n - step; c1++) {
        s += a.get(c1).get(n - step - 1) + ", ";
      }

      for (int r2 = n - step - 1 - 1; r2 >= step; r2--) {
        s += a.get(n - step - 1).get(r2) + ", ";
      }

      for (int c2 = n - step - 1 - 1; c2 >= step + 1; c2--) {
        s += a.get(c2).get(step) + ", ";
      }

    }
    System.out.println(s);
  }

}
