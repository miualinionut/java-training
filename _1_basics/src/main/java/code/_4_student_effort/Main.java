package code._4_student_effort;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class Main {

  public static void fizzBuzz() {
    for (int i = 1; i <= 100; i++) {
       if (i % 15 == 0) {
        System.out.println("FizzBuzz, ");
      } else if (i % 3 == 0) {
        System.out.println("Fizz,");
      } else if (i % 5 == 0) {
        System.out.println("Buzz, ");
      } else if ( i% 7 == 0) {
        System.out.println("Rizz, ");
      } else if ( i% 11 == 0) {
        System.out.println("Jazz, ");
      } else {
        System.out.println(i);
      }

    }
  }
  public static String compute(int x) {
    String result = "";
      if (x%3 == 0)
        result = "Foo";

      if (x%5 == 0)
        result += "Bar";

      if (x%7 == 0) {
        result += "Qix";
      }
      result += contains(x);

      if (result != null && result.isEmpty()) // in case of numbers like 1,2,4...
        result += x;

      return result;
  };

  public static String contains(int y) {
    String add = "";
    char[] arr = String.valueOf(y).toCharArray();
    for (char number : arr) {
      if (number == '3') {
        add += "Foo";
      } else if (number == '5') {
        add += "Bar";
      } else if (number == '7') {
        add += "Qix";
      } else if (number == '0'){
        add += "*";
      }
    }
    return add;
  }

  public static void pairOfTwo(int [] arr) {

    int [] pozj = new int[arr.length];
    int z =0;
    int nr = 0;

    for (int i=0; i <arr.length; i++) {
      if ( i!= 0 && search(i, pozj))
         i++;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == 0) {
          nr++;
          pozj[z] =j;
          z++;
          break;
        }
      }
    }
   System.out.println(nr);
  }
  public static boolean search(int i, int[] arr) {
    for (int x: arr)
      if (x == i)
        return true;
    return false;
  }


  public static void main(String[] args) {
//    fizzBuzz();
//    System.out.println(compute(105));
//    pairOfTwo(new int[]{3,2,-3,-2,3,0});
//    pairOfTwo(new int[]{1,1,0,-1,-1});
//    pairOfTwo(new int[]{5,9,-5,7,-5});
  }
}
