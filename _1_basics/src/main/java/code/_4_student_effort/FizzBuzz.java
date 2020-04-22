package code._4_student_effort;

public class FizzBuzz {

    public static void main(String[] args) {
        String s1 = "Fizz", s2 = "Buzz", s3 = "Rizz", s4 = "Jazz";
        for (int x = 1; x < 101; x++) {
            String s = "";
            if (x % 3 == 0)
                s = s.concat(s1);
            if (x % 5 == 0)
                s = s.concat(s2);
            if (x % 7 == 0)
                s = s.concat(s3);
            if (x % 11 == 0)
                s = s.concat(s4);
            if (s != "")
                System.out.println(s);
            else System.out.println(x);
        }
    }
}