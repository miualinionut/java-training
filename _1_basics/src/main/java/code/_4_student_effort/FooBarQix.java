package code._4_student_effort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FooBarQix {

    private static final String THREE = "FOO";
    private static final String FIVE = "BAR";
    private static final String SEVEN = "QIX";

    public String compute(int number) {
        List<Integer> digits = getNumberDigits(number);
        Collections.reverse(digits);
        StringBuilder result = new StringBuilder();
        if (number % 3 == 0) {
            result.append(THREE);
        }
        if (number % 5 == 0) {
            result.append(FIVE);
        }
        if (number % 7 == 0) {
            result.append(SEVEN);
        }
        for (Integer digit : digits) {
            if (digit == 3) {
                result.append(THREE);
            } else if (digit == 5) {
                result.append(FIVE);
            } else if (digit == 7) {
                result.append(SEVEN);
            }
        }
        if(result.toString().isEmpty()) {
            return String.valueOf(number);
        }
        return result.toString();
    }

    private List<Integer> getNumberDigits(int number) {
        List<Integer> digits = new LinkedList<>();
        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        return digits;
    }

}
