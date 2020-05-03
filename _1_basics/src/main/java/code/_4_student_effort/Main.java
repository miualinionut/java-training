package code._4_student_effort;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean run = true;
    while (run) {
      System.out.println("Select challenge number (1,2,3,4). Input 0 to exit:");
      int i = input.nextInt();
      switch (i) {
        case 0:
          run = false;
          break;
        case 1:
          FizzBuzz challenge1 = new FizzBuzz();
          challenge1.printNumbers();
          break;

        case 2:
          FooBarQix challenge2 = new FooBarQix();
          challenge2.printNumbers(100);
          break;

        case 3:
          PairOf2 challenge3 = new PairOf2();
          challenge3.countPairs(new int[]{-1, 0, 2, 1, 4, -2});
          break;

        case 4:
          PairOf3 challenge4 = new PairOf3();
          challenge4.countPairs(new int[]{2, 2, 0, -4, 1, -1, -6, 5, 1, 3, 3});
          break;

        default:
          System.out.println("Unknown command!");
          break;
      }
    }
  }
}
