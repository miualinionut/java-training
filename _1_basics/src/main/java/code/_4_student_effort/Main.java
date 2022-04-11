package code._4_student_effort;

public class Main {
    public static void main(String[] args) {
        Challenge challenge = new Challenge();
        challenge.FizzBuzz();
        // FooBarQix
        for (int i = 1; i <= 53; i++)
            System.out.println(challenge.compute(i));

    }
}
