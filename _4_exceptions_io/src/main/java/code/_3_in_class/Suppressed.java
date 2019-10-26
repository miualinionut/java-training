package code._3_in_class;

public class Suppressed {
  public static void main(String[] args) {
    try {
      throw new RuntimeException("ex1");
    } catch (Exception e) {
      throw new RuntimeException("ex2");
    }
  }
}
