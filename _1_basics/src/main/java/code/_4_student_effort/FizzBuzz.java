package code._4_student_effort;

public class FizzBuzz {

    public static void fizzBuzz(){
        for(int i=0;i<=100;i++){
             if(i%5==0){
                if(i%3==0) {
                    System.out.println("FizzBuzz");
                }
                System.out.println("Buzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else
                System.out.println(i);
        }
    }
}
