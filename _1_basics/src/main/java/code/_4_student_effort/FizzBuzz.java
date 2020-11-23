package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 105; i++) {
            String output="";
            if (i%3==0) {
                output+="Fizz";
            }
            if (i%5==0) {
                output+="Buzz";
            }
            //stage 2
            if (i%7==0) {
                output+="Rizz";
            }
            if (i%11==0) {
                output+="Jazz";
            }
            if (output!="")
                System.out.println(output); else
                System.out.println(i);
        }
    }
}