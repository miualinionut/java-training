package code._4_student_effort;

public class FizzBuzz {

    public static String fizzbuzz(int n){

        String s = "";
        if(n % 3 == 0)
            s += "Fizz";
        if( n % 5 == 0)
            s += "Buzz";
        if (n % 7 ==0)
            s += "Rizz";
        if (n % 11 == 0)
            s += "Jazz";
        if( n % 3 != 0 && n % 5 != 0 && n % 7 != 0 && n % 11 != 0)
            s += String.valueOf(n);



        return s;
    }
}
