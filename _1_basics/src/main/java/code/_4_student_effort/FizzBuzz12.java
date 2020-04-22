package code._4_student_effort;

public class FizzBuzz12 {
    public static void fizzbuzz1(){
        for (int i = 1; i < 101; i++) {
            if(i%3 == 0) System.out.print("Fizz");
            if(i%5 == 0) System.out.print("Buzz");
            if(i%3 != 0 && i%5 != 0) System.out.print(i);
            System.out.print(", ");
        }
    }

    public static void fizzbuzz2() {
        for (int i = 1; i < 101; i++) {
            if(i%3 == 0) System.out.print("Fizz");
            if(i%5 == 0) System.out.print("Buzz");
            if(i%7 == 0) System.out.print("Rizz");
            if(i%11 == 0) System.out.print("Jazz");
            if(i%3 != 0 && i%5 != 0 && i%7 != 0 && i%11!=0) System.out.print(i);
            System.out.print(", ");
        }
    }
    public static void main(String[] args) {
        fizzbuzz1();
        System.out.println();
        fizzbuzz2();
    }
}
