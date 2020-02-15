package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 0;i<100;i++) {
            if ((i+1) % 15 == 0) {
                System.out.print("FizzBuzz" + ", ");
            } else if((i+1) %3 == 0) {
                System.out.print("Fizz" + ", ");
            } else if ((i+1) %5 ==0) {
                System.out.print("Buzz" + ", ");
            } else {
                System.out.print(i + 1 + ", ");
            }
        }
    }
}
