package code._4_student_effort;

public class CC1Stage2 {
    public static void main(String[] args) {
        boolean x = false;
        for(int i=1;i<=100;i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                x = true;
                System.out.print(" FizzBuzz ");
            }
            if (i % 5 == 0) {
                x = true;
                System.out.print(" Buzz ");
            }
            if (i % 3 == 0) {
                x = true;
                System.out.print(" Fizz ");
            }
            if (i % 7 == 0)
            {
                x = true;
                System.out.print("Rizz");
            }
            if (i % 11 ==0)
            {
                x = true;
                System.out.print("Jazz");
            }
            if( x == false){
                System.out.print(i+ " ");
            }
        }
    }
}
