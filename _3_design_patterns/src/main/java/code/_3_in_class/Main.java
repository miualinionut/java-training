package code._3_in_class;

public class Main {

  public static void main(String[] args) {
    /*
     * System.out.println("singleton");
     * Singleton s1 = Singleton.getInstante();
     * Singleton s2 = Singleton.getInstante();
     */
      C1 c1 = new C1();
      Mostenire mostenire = new Mostenire();
      mostenire.m1();

      Delegare delegare = new Delegare();
      delegare.m1();
  }
}
class C1 {

  void m1() {
    System.out.println("C1 m1()");
  }
}
  class Mostenire extends C1{}
  class Delegare{
    C1 c1 = new C1();
    void m1(){
      c1.m1();
    }
  }
