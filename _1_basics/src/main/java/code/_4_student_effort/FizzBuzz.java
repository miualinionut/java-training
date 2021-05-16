package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args) {
        int i;
        for(i = 1; i<=100; i ++){
            if(i%3==0 || i%5==0) {
                if (i % 3 == 0) {
                    System.out.print("Fizz");
                }
                if (i % 5 == 0) {
                    System.out.print("Buzz");
                }
            }
            else
                if(i%7==0 || i%11==0) {
                    if(i%7==0) {
                        System.out.print("Rizz");
                    }
                    if (i % 11 == 0) {
                        System.out.print("Jazz");
                    }
                }
                else
                    System.out.print(i);

            System.out.print(", ");
        }
    }
}
