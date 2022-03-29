package code._4_student_effort;

public class FizzBuzz {
    public static String give_me_string(int i){
        if(i % 15 == 0)
            return "FizzBuzz";
        if(i % 3 == 0)
            return "Fizz";
        if(i % 5 == 0)
            return "Buzz";
        if(i % 7 == 0)
            return "Rizz";
        if(i % 11 == 0)
            return "Jazz";
        return String.valueOf(i);
    }

    public static String fizzBuzz(){
        String result = "";
        for(int i = 1; i <= 100; ++i){
            result += give_me_string(i) + ' ';
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzz.fizzBuzz());
    }
}
