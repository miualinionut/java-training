package code._4_student_effort.fizz_buzz;
// basic implementation
//
public class Fizz_Buzz {
    public static void main(String[] args) {
        for(int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 7 == 0) {
                System.out.println("Rizz");
            } else if(i % 11 == 0) {
                System.out.println("Jazz");
            }
            else {
                System.out.println(i);
            }

        }
    }
}
