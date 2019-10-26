package code._1_study._4_starvation;

public class OnePersonKitchen {

  public static void eat() {
    try {
      Thread.sleep(1_000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}