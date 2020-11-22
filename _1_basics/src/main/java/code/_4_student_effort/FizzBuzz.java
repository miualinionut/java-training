package code._4_student_effort;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            if(i != 1){
                System.out.print(", ");
            }
            if(i % 3 == 0 ){
                if(i % 5 == 0){
                    System.out.print("FizzBuzz");
                }
                else if (i % 7 == 0){
                    System.out.print("FizzRizz");
                }
                else if (i % 11 == 0){
                    System.out.print("FizzJazz");
                }
                else {
                    System.out.print("Fizz");
                }
            }
            else if(i % 5 == 0 ){
                if(i % 7 == 0){
                    System.out.print("BuzzRizz");
                }
                else if (i % 11 == 0){
                    System.out.print("BuzzJazz");
                }
                else{
                    System.out.print("Buzz");
                }
            }
            else if(i % 7 == 0 ){
                if(i % 11 == 0){
                    System.out.print("RizzJazz");
                }
                else{
                    System.out.print("Rizz");
                }
            }
            else if (i % 11 == 0){
                System.out.print("Jazz");
            }
            else{
                System.out.print(i);
            }
        }
    }
}
