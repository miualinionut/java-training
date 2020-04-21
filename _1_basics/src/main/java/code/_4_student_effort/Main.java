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
          Challenge_1 challenge1 = new Challenge_1();
          challenge1.printNumbers();
          break;

        case 2:
          Challenge_2 challenge2 = new Challenge_2();
          challenge2.printNumbers(100);
          break;

        case 3:
          Challenge_3 challenge3 = new Challenge_3();
          challenge3.countPairs(new int[]{-1, 0, 2, 1, 4, -2});
          break;

        case 4:
          Challenge_4 challenge4 = new Challenge_4();
          challenge4.countPairs(new int[]{2, 2, 0, -4, 1, -1, -6, 5, 1, 3, 3});
          break;

        default:
          System.out.println("Unknown command!");
          break;
      }
    }
  }
}
