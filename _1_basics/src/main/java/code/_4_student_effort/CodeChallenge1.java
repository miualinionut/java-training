package code._4_student_effort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CodeChallenge1 {

    public static void main(String[] args) {

        Challenge1();
    }
    public static void Challenge1() {
        /*String anArray[] = new String[100];
        String Fizz = "Fizz";
        for(int i = 1; i<=100; i++){
            anArray[i-1] = String.valueOf(i);
            if(i % 3 == 0){
                anArray[i-1] = Fizz;
            }else anArray[i-1] = String.valueOf(i);
        }
            System.out.println(Arrays.toString(anArray));
        */
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            if (i % 7 == 0) {
                System.out.print("Rizz");
            }
            if (i % 11 == 0) {
                System.out.print("Jazz");
            }
            if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0) {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}