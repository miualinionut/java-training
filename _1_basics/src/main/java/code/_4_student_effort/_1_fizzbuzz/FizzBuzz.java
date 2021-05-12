package code._4_student_effort._1_fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            if (isDivisible(i, 15)) {
                s.append("FizzBuzz, ");
            }
            else if (isDivisible(i, 3)) {
                s.append("Fizz, ");
            }
            else if(isDivisible(i, 5)) {
                s.append("Buzz, ");
            }
            else if(isDivisible(i, 7)) {
                s.append("Rizz, ");
            }
            else if(isDivisible(i, 11)) {
                s.append("Jazz, ");
            }
            else {
                s.append(i + ", ");
            }
        }
        System.out.println(s);
    }

    public static boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }
}
