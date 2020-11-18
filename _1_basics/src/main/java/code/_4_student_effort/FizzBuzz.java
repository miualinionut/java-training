package code._4_student_effort;

public class FizzBuzz {

    public static void fizzBuzz(){
        for(int i=0;i<=100;i++){
             if(i%5==0){
                if(i%3==0) {
                    System.out.println("FizzBuzz");
                }
                else if(i%7==0){
                    System.out.println("RizzBuzz");
                }
                else if(i%11==0){
                    System.out.println("RizzJazz");
                }
                System.out.println("Buzz");
            }
            else if(i%3==0){
                 if(i%7==0){
                     System.out.println("FizzRizz");
                 }
                 else if(i%11==0){
                     System.out.println("FizzJazz");
                 }
                System.out.println("Fizz");
            }
             else if(i%7==0){
                 if(i%11==0){
                     System.out.println("RizzJazz");
                 }
                 System.out.println("Rizz");
             }
             else if(i%11==0){
                 System.out.println("Jazz");
             }
            else
                System.out.println(i);
        }
    }
}
