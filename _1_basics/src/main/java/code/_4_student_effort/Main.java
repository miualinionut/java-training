package code._4_student_effort;

public class Main {

  private static void checkXValue(int x, int expectedValue) {
      System.out.println("Have you guessed the value of x correctly? - "  + (x==expectedValue));
  }

  public static void main(String[] args) {
    // 1
    System.out.println("Hello world! I'm Darius");

    // 2
    int x = 0;
    while(x++ < 10);
    checkXValue(x, 11);
  }

}
