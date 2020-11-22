package code._4_student_effort;

public class FizzBuzz {

    public static void main(String args[]){
       // fizzBuzz1();
        fizzBuzz2();
    }

    public static void fizzBuzz1(){
        int i;
        for(i = 1; i <=100; i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");

            }
            else {
                if (i % 5 != 0 && i % 3 == 0) {
                    System.out.println("Fizz");
                }
                else {
                    if (i % 5 == 0) {
                        System.out.println("Buzz");
                    }
                    else{
                        System.out.println(i);
                    }
                }
            }
        }
    }

    public static void fizzBuzz2(){
        String output;
        int i;
        for(i = 1; i <= 100; i++){
            output = ("");
            if(i % 3 == 0)
                output = output + "Fizz";
            if(i % 5 == 0)
                output = output + "Buzz";
            if (i % 7 == 0)
                output = output + "Rizz";
            if (i % 11 == 0)
                output = output + "Jazz";
            if(output.equals("")){
                System.out.println(i);
            }
            else System.out.println(output);
        }
    }
}
