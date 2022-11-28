package code._4_student_effort.challenge_2;

public class FooBarQix {

    public String compute(int number) {
        NumberToWord[] numberToWords = {
                new NumberToWord(3, "Foo"),
                new NumberToWord(5, "Bar"),
                new NumberToWord(7, "Qix")
        };

        String divisibilityString = "";
        boolean correlation = false;
        for (NumberToWord it: numberToWords) {
            if (number % it.getNumber() == 0) {
                correlation = true;
                divisibilityString += it.getWord();
            }
        }

        String digitString = "";
        char[] digits = String.valueOf(number).toCharArray();
        for (char digit: digits) {
            for (NumberToWord it: numberToWords) {
                if (Character.getNumericValue(digit) == it.getNumber()) {
                    correlation = true;
                    digitString += it.getWord();
                }
            }
        }

        if (!correlation)
            return String.valueOf(number);
        return divisibilityString + digitString;
    }
}
