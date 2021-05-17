package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(compute(i));
        }
    }

    public static String compute(int i) {
        String s = "";
        if (i % 3 == 0)
            s += "Fizz";
        if (i % 5 == 0)
            s += "Buzz";
        if (i % 7 == 0)
            s += "Rizz";
        if (i % 11 == 0)
            s += "Jazz";

        if(s.length() == 0)
            s += i;

        return s;
    }
}
