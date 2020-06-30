package code._4_student_effort;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here

  }
}






class Quiz8 implements Comparator {



  static String[] strings = {"d", "bbb", "aaaa"};



  public int compare(Object o1, Object o2) {

    int s1 = ((String) o1).length();

    int s2 = ((String) o2).length();

    return s1 - s2;

  }



  public static void main(String[] args) {

    Quiz8 comparator = new Quiz8();

    int result = Arrays.binarySearch(strings, "cc", comparator);



    System.out.println(result);

  }



}











//class Clazz {
//
//  private long id;
//
//  private String name;
//
//
//
//  Clazz(long id, String name) {
//
//    this.id = id;
//
//    this.name = name;
//
//  }
//
//
//
//  @Override
//
//  public String toString() {
//
//    return "Clazz [" + id + "-" + name + "]";
//
//  }
//
//
//
//  long getId() {
//
//    return id;
//
//  }
//
//}
//
//
//
//class Quiz5 {
//
//
//
//  public static void main(String[] args) {
//
//    var objectList = Arrays.asList(
//
//            new Clazz(1, "A"),
//
//            new Clazz(2, "B"),
//
//            new Clazz(3, "C"),
//
//            new Clazz(4, "D"));
//
//
//
//    var result = objectList.stream().collect(
//
//            Collectors.teeing(
//
//                    Collectors.filtering(o -> o.getId() > 2, Collectors.toList()),
//
//                    Collectors.filtering(o -> o.getId() > 2, Collectors.counting()),
//
//                    (list, count) -> {
//
//                      Map<String, Object> map = new HashMap<>();
//
//                      map.put("objects", list);
//
//                      map.put("count", count);
//~
//
//
//                      return map;
//
//                    }
//
//            ));
//
//
//
//    System.out.println(result);
//
//  }
//
//
//
//}





















//interface Quiz3  {
//
//  default void print() {
//
//    System.out.println("Printed 1!");
//
//  }
//  static interface Nested1 extends Quiz3 {
//
//    default void print() {
//
//      System.out.println("Printed 2!");
//    }
//    static class Nested2 implements Nested1 {
//
//      public void print() {
//
//        System.out.println("Printed 3!");
//
//      }
//
//    }
//
//  }
//  static void main(String[] args) {
//
//    Quiz3 q = new Nested1.Nested2();
//
//    q.print();
//
//  }
//
//}


















/*S
clasa abstracta
anonima
interna
state
behavior
polimorfism static
polimorfism dinamic
design pattern
overloading
overriding
inheritance
implementation
interfata





 */