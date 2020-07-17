package code._1_study._1_hello_world;

public class HelloWorld {
  public static void main(String[] args) {
    int i = 1;
    switch(i) {
      case 1:
        System.out.println("one");
      case 2:
        System.out.println("two");
        break;
      default:
        System.out.println("not valid");
    }
  }
}