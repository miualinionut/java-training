package code._4_student_effort;

public class codeChallenge1 {
    public static void main(String[] args) {
        for(int i = 1; i<101; i++) {
            if (multipleOfSeven(i))
                System.out.println("Rizz");
            else if (multipleOfEleven(i))
                System.out.println("Jazz");
            else if (multipleOfThree(i) && multipleOfFive(i))
                System.out.println("FizzBuzz");
            else if (multipleOfThree(i))
                System.out.println("Fizz");
            else if (multipleOfFive(i))
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    static boolean multipleOfThree(int number) {
        return number % 3 == 0;
    }

    static boolean multipleOfFive(int number) {
        return number % 5 == 0;
    }

    static boolean multipleOfSeven(int number) {
        return number % 7 == 0;
    }

    static boolean multipleOfEleven(int number) {
        return number % 11 == 0;
    }
}
