package code._3_in_class;

import java.io.FileNotFoundException;

public class Exceptions {

  public static void main(String[] args) {
    try {
      System.out.println(brokenMethod(1, 2));
      System.out.println(brokenMethod(3, 0));
    } catch (FileNotFoundException | ArithmeticException e) {
      System.out.println("error");
    }
  }

  private static Integer brokenMethod(Integer a, Integer b)
          throws FileNotFoundException {
    return a / b;
  }
}
