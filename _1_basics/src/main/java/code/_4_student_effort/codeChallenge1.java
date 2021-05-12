package code._4_student_effort;

public class codeChallenge1 {
    public static void main(String[] args) {
        for(int i = 1; i<101; i++) {
            if (divSeven(i))
                System.out.println("Rizz");
            else if (divEleven(i))
                System.out.println("Jazz");
            else if (divThree(i) && divFive(i))
                System.out.println("FizzBuzz");
            else if (divThree(i))
                System.out.println("Fizz");
            else if (divFive(i))
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    static boolean divThree(int number) {
        return number % 3 == 0;
    }

    static boolean divFive(int number) {
        return number % 5 == 0;
    }

    static boolean divSeven(int number) {
        return number % 7 == 0;
    }

    static boolean divEleven(int number) {
        return number % 11 == 0;
    }
}
