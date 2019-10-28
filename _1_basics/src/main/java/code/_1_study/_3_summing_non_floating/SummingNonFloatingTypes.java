package code._1_study._3_summing_non_floating;

public class SummingNonFloatingTypes {
  public static void main(String[] args) {
    sumBytes();
    sumShorts();
    sumInts();
  }

  private static void sumBytes() {
    byte x = 5;
    byte y = 10;
    byte sum;
    sum = (byte) (x + y);
  }

  private static void sumShorts() {
    short x = 5;
    short y = 10;
    short sum;
    sum = (short) (x + y);
  }

  private static void sumInts() {
    int x = 5;
    int y = 10;
    int sum;
    sum = x + y;
  }
}