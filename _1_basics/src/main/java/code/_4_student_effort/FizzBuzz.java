package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 100;
        //stage 1 & 2
        //Basic approach
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 21 == 0) {
                System.out.println("FizzRizz");
            } else if(i % 33 == 0) {
                System.out.println("FizzJazz");
            } else if(i % 55 == 0) {
                System.out.println("BuzzJazz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 7 == 0) {
                System.out.println("Rizz");
            } else if (i % 11 == 0) {
                System.out.println("Jazz");
            }
            else System.out.println(" " + i);
        }

        }
    }



