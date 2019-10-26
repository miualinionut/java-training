package code._3_in_class;

public class MyFinally {

  public static void main(String[] args) {
    System.out.println(ex());
  }

  private static int ex() {
    try {
      return 0;
    } catch (Exception e) {
      return 1;
    } finally {
      return 2;
    }
  }

}
