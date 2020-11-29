package code._4_student_effort.Challenge1;

public class fizzbuzz {
    public static String fizzbuzz1(Integer nr) {
        if (nr % 3 == 0 && nr % 5 == 0)
            return "FizzBuzz";
        else if (nr % 3 == 0)
            return "Fizz";
        else if (nr % 5 == 0)
            return "Buzz";
        else
            return nr.toString();
    }

    public static String fizzbuzz2(Integer nr) {
        StringBuilder ans = new StringBuilder();
        if (nr % 3 == 0)
            ans.append("Fizz");
        if (nr % 5 == 0)
            ans.append("Buzz");
        if (nr % 7 == 0)
            ans.append("Rizz");
        if (nr % 11 == 0)
            ans = ans.append("Jazz");
        return ans.toString();
    }
}