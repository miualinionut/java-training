package code._1_study._2_postfix_increment;

public class PostfixIncrement {

  public static void main(String[] args) {

    int x = 0;

    while (++x < 10) {
      System.out.println("x = " + x);
    }
//    checkForXValue(x);

  }

  private static void checkForXValue(int x) {
    int expectedXValue = 11;

    System.out.println("Guessed correctly the value of x ? - " + (x == expectedXValue));

  }

}