package code._4_student_effort;

public class FooBarQix {
    private static final String FOO = "Foo";
    private static final String BAR = "Bar";
    private static final String QIX = "Qix";

    public static void main(String[] args) {
        System.out.println("Input 1 => " + compute(1));
        System.out.println("Input 2 => " + compute(2));
        System.out.println("Input 3 => " + compute(3));
        System.out.println("Input 4 => " + compute(4));
        System.out.println("Input 5 => " + compute(5));
        System.out.println("Input 6 => " + compute(6));
        System.out.println("Input 7 => " + compute(7));
        System.out.println("Input 8 => " + compute(8));
        System.out.println("Input 9 => " + compute(9));
        System.out.println("Input 10 => " + compute(10));
        System.out.println("Input 13 => " + compute(13));
        System.out.println("Input 15 => " + compute(15));
        System.out.println("Input 21 => " + compute(21));
        System.out.println("Input 33 => " + compute(33));
        System.out.println("Input 51 => " + compute(51));
        System.out.println("Input 53 => " + compute(53));
        System.out.println("Input 101 => " + compute2(101));
        System.out.println("Input 303 => " + compute2(303));
        System.out.println("Input 105 => " + compute2(105));
        System.out.println("Input 10101 => " + compute2(10101));
        System.out.println("Input 1010101 => " + compute2(1010101));
    }

    private static String compute(int number) {
        String output = "";
        StringBuilder stringToAppend = new StringBuilder();
        int copyOfNumber = number;
        int currentDigit;
        boolean divisibleBy3 = (number % 3 == 0);
        boolean divisibleBy5 = (number % 5 == 0);
        boolean divisibleBy7 = (number % 7 == 0);
        boolean divisibleWithSomething =
                divisibleBy3 || divisibleBy5 || divisibleBy7;

        if (divisibleBy3)
            output += FOO;
        if (divisibleBy5)
            output += BAR;
        if (divisibleBy7)
            output += QIX;

        while (copyOfNumber > 0) {
            currentDigit = copyOfNumber % 10;
            if (currentDigit == 3)
                stringToAppend.insert(0, FOO);
            if (currentDigit == 5)
                stringToAppend.insert(0, BAR);
            if (currentDigit == 7)
                stringToAppend.insert(0, QIX);
            copyOfNumber /= 10;
        }

        output += stringToAppend;

        if (!(divisibleWithSomething || !stringToAppend.toString().equals("")))
            return String.valueOf(number);

        return output;
    }

    private static String compute2(int number){
        String output = "";
        StringBuilder stringToAppend = new StringBuilder();
        int copyOfNumber = number;
        int currentDigit;
        boolean divisibleBy3 = (number % 3 == 0);
        boolean divisibleBy5 = (number % 5 == 0);
        boolean divisibleBy7 = (number % 7 == 0);
        boolean divisibleWithSomething =
                divisibleBy3 || divisibleBy5 || divisibleBy7;

        if (divisibleBy3)
            output += FOO;
        if (divisibleBy5)
            output += BAR;
        if (divisibleBy7)
            output += QIX;

        while (copyOfNumber > 0) {
            currentDigit = copyOfNumber % 10;
            if (currentDigit == 0)
                stringToAppend.insert(0, "*");
            else if (!divisibleWithSomething)
                stringToAppend.insert(0, currentDigit);
            if (currentDigit == 3)
                stringToAppend.insert(0, FOO);
            if (currentDigit == 5)
                stringToAppend.insert(0, BAR);
            if (currentDigit == 7)
                stringToAppend.insert(0, QIX);
            copyOfNumber /= 10;
        }

        output += stringToAppend;

        if (!(divisibleWithSomething || !stringToAppend.toString().equals("")))
            return String.valueOf(number);

        return output;
    }
}
