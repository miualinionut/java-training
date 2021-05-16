package code._4_student_effort;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        boolean printnumber;
        for (int i = 1; i <= 100; ++i) {
            printnumber = true;
            if (i % 3 == 0) {
                System.out.print("Fizz");
                printnumber = false;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                printnumber = false;
            }
            if (printnumber) {
                System.out.print(i);
            }
            System.out.print(", ");
        }
    }
}
