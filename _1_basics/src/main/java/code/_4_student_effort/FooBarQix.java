package code._4_student_effort;

public class FooBarQix {
    public String compute (int value) {
        String outputString = "";

        // divisible by 3
        if (value % 3 == 0) {
            outputString += "Foo";
        // divisible by 5
        } else if (value % 5 == 0) {
            outputString += "Bar";
        // divisible by 7
        } else if (value % 7 == 0) {
            outputString += "Qix";
        }

        outputString += compute2(value);

        return outputString;
    }

    String compute2 (int value) {
        String outputString = "";

        // for each digit 3, 5, 7 add "Foo", "Bar", Qix in the digits order
        String number = String.valueOf(value);
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '3') {
                outputString += "Foo";
            } else if (number.charAt(i) == '5') {
                outputString += "Bar";
            } else if (number.charAt(i) == '7') {
                outputString += "Qix";
            } else if (number.charAt(i) == '0') {
                outputString += "*";
            }
        }

        return outputString;
    }

    public static void main(String[] args) {
        int number = 37375;
        FooBarQix test = new FooBarQix();

        System.out.println(test.compute(number));
    }
}
