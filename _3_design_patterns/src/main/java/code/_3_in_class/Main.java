package code._3_in_class;

interface MyInteface{
  void metoda();
}

class Implementare implements MyInteface{
  @Override
  public void metoda() {
    System.out.println("s-a apelat implementarea");
  }
}
public class Main {

  static class ClasaNested{
    static int nestedInt = 0; //clasa in clasa
  }

  class ClasaInner{
    int InnerInt = 1;
  }

  public static void main(String[] args) {
    //TODO put your code changes in here
    System.out.println(ClasaNested.nestedInt);

    MyInteface contract = new MyInteface() { //clasa anonima
      @Override
      public void metoda() {
        System.out.println("s-a apelat clasa anonima");
      }
    };

  }
}