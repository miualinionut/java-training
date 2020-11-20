package code._4_student_effort.FizzBuzz;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        FizzBuzz2 fb2 = new FizzBuzz2();
        for(int i = 1; i < 101; i++) {
            fb.printString(i);
        }
        for(int i = 1; i < 101; i++) {
            fb2.print(i);
        }
    }
}
