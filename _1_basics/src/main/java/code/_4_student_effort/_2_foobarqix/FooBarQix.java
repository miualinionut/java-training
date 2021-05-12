package code._4_student_effort._2_foobarqix;

public class FooBarQix {
    public static void main(String[] args) {

        System.out.println("1 => " + compute(1));
        System.out.println("15 => " + compute(15));
        System.out.println("21 => " + compute(21));
        System.out.println("33 => " + compute(33));

        System.out.println("101 => " + compute2(101));
        System.out.println("303 => " + compute2(303));
        System.out.println("105 => " + compute2(105));
        System.out.println("10101 => " + compute2(10101));

    }

    public static String compute(int number) {
        String s = "";

        if(isDivisible(number, 3)) {
            s += "Foo";
        }
        if(isDivisible(number, 5)) {
            s += "Bar";
        }
        if(isDivisible(number, 7)) {
            s += "Qix";
        }

        char [] digits = Integer.toString(number).toCharArray();

        for(char digit : digits) {
            if(digit == '3') {
                s += "Foo";
            }
            else if(digit == '5') {
                s += "Bar";
            }
            else if(digit == '7') {
                s += "Qix";
            }
            else if(isNotDivisible(number)) {
                s += digit;
            }
        }
        return s;
    }

    public static String compute2(int number) {
        String s = "";

        if(isDivisible(number, 3)) {
            s += "Foo";
        }
        if(isDivisible(number, 5)) {
            s += "Bar";
        }
        if(isDivisible(number, 7)) {
            s += "Qix";
        }

        char [] digits = Integer.toString(number).toCharArray();

        for(char digit : digits) {
            if(digit == '3') {
                s += "Foo";
            }
            else if(digit == '5') {
                s += "Bar";
            }
            else if(digit == '7') {
                s += "Qix";
            }
            else if(digit == '0') {
                s += "*";
            }
            else if(isNotDivisible(number)) {
                s += digit;
            }
        }
        return s;
    }


    public static boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }

    public static boolean isNotDivisible(int number) {
        if(!isDivisible(number, 3) && !isDivisible(number, 5) && !isDivisible(number, 7)) {
            return true;
        }
        else {
            return false;
        }
    }
}
