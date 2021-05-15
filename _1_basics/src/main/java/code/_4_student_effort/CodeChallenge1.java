package code._4_student_effort;

public class CodeChallenge1 {

    private String fizzBuzz1(Integer i) {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (i % 3 != 0 && i % 5 != 0) {
            result += String.valueOf(i);
        }
        return result;

    }

    private String fizzBuzz2(Integer i) {
        String result = "";
        if (i % 7 == 0) {
            result += "Rizz";
        }
        if (i % 11 == 0) {
            result += "Jazz";
        }
        if (i % 7 != 0 && i % 11 != 0) {
            result += String.valueOf(i);
        }
        return result;
    }

    public void requirements1(){
        System.out.println("Requirements 1:");
        for (int i = 1; i <= 100; i++)
            System.out.println(fizzBuzz1(i));
    }

    public void requirements2(){
        System.out.println("Requirements 2:");
        for (int i = 1; i <= 100; i++)
            System.out.println(fizzBuzz2(i));
    }

}
