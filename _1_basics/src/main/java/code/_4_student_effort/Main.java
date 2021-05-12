package code._4_student_effort;

public class Main {



    public static void main(String[] args) {
        //TODO put your code changes in here

        for (int i = 1; i < 101; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.print("FizzBuzz ");
            }else if (i % 3 == 0){
                System.out.print("Fizz ");
            }else if (i % 5 == 0){
                System.out.print("Buzz ");
            }else {
                System.out.print(" "+ i +" ");
            }
        }
    }
}
