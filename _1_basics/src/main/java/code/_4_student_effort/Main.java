package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    System.out.println("hello");

    //PairOf2
    int[] numbers = {5,9,-5,7,-5};
    System.out.println(PairOf2.countPairs(numbers));

    //FooBarQix
    System.out.println(FooBarQix.compute(15));
    System.out.println(FooBarQix.compute2(105));

    int[] numbers2 = {-1,-1,-1,2};
    System.out.println(PairOf3.countPairs(numbers2));
  }
}
