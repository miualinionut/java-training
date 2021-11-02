package code._4_student_effort;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printNumbers(100);

        PairOfTwo pairOfTwo = new PairOfTwo();
        int[] array = {-1, -2, -3, 3, -2, 2, 7, 11, 0};
        pairOfTwo.findPairsOfTwo(array, 0);

        FooBarQix fooBarQix = new FooBarQix();
        System.out.println(fooBarQix.compute(33591));
        System.out.println(fooBarQix.compute(11));
    }
}
