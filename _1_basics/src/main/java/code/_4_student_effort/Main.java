package code._4_student_effort;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        //FizzBuzz

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print("Fizzbuzz ");
            }else if(i % 9 == 0){
              System.out.print("Jazz ");
            }else if(i % 7 == 0){
              System.out.print("Rizz");
            }else if(i % 5 == 0){
              System.out.print("Buzz");
            } else if (i % 3 == 0){
              System.out.print("Fizz");
            }else{
              System.out.print(i + " ");
            }
        }

    }
}
