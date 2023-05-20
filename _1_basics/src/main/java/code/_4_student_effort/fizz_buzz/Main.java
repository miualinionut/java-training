package code._4_student_effort.fizz_buzz;

public class Main {

    public static void main(String[] args) {
        Fizz2 test_obj = new Fizz2();
        String s;
        for(int i = 1; i < 101; i++) {
            s = test_obj.fizz(i);
            System.out.print(s + " ");
        }
        System.out.println();
        for(int i = 1; i < 101; i++) {
            s = test_obj.fizz2(i);
            System.out.print(s + " ");
        }
    }
}
