package code._3_in_class;

public class Main {

  public static void main(String[] args) {
    System.out.println("singleton");
    Singleton s1 = Singleton.getInstante();
    Singleton s2 = Singleton.getInstante();
  }
}