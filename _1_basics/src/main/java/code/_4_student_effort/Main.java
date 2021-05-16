package code._4_student_effort;

import com.sun.nio.sctp.SctpSocketOption;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        //3 Fizz
        //5 BUzz
        //15 FizzBuzz
        //7 Rizz
        //11 Jazz
        //77 RizzJazz
        for(int i = 1; i<=99; i++){

            if(i % 15 == 0){
                System.out.print("FizzBuzz, ");
            }
            else if(i % 3 == 0){
                System.out.print("Fizz, ");
            }
            else if(i % 5 == 0){
                System.out.print("Buzz, ");
            }
            else if(i % 7 == 0){
                System.out.print("Rizz, ");
            }
            else if(i % 11 == 0){
                System.out.print("Jazz, ");
            }
            else if(i % 77 == 0){
                System.out.print("RizzJazz, ");
            }
            else {
                System.out.print(i  + ", ");
            }
        }

        System.out.print(100 + ".");

    }
}
