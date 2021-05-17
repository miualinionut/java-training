package code._4_student_effort;

import java.util.HashMap;
import java.util.Map;

public class StudentFooBarQix implements Command {
    Map<String, String> digitsToString;
    Map<String, String> divStrings;


    public StudentFooBarQix() {
        this.digitsToString = new HashMap<>();
        this.digitsToString.put("3", "Foo");
        this.digitsToString.put("5", "Bar");
        this.digitsToString.put("7", "Qix");
        this.digitsToString.put("0", "*");

        this.divStrings = new HashMap<>();
        this.divStrings.put("3", "Foo");
        this.divStrings.put("5", "Bar");
        this.divStrings.put("7", "Qix");
    }

    /**
     *      Converts integer to String using divStrings rules
     *      3 => "FooFoo"
     *      14 => "Qix"
     *      15 => "FooBar"
     *      37 => ""
     */
    private String addFromDivisibility(int number) {
        StringBuilder string = new StringBuilder();
        for (Map.Entry<String, String> stringEntry : this.divStrings.entrySet()) {
            String divNumber = stringEntry.getKey();
            if (number % Integer.parseInt(divNumber) == 0)
                string.append(this.divStrings.get(divNumber));
        }
        return string.toString();
    }

    /**
     *     Converts integer to String using digitsToString rules, considering fromDivIsEmpty boolean
     *     When addFromDigits is called, the boolean fromDivIsEmpty will be:
     *          True if the function addFromDivisibility returns an empty string
     *          False if the function addFromDivisibility returns a non-empty string
     *          fromDivIsEmpty = (addFromDivisibility(number).equals(""))
     *     If the fromDivIsEmpty boolean is True, we write the digits of the numbers
     *     101 => 1*1
     *     If the fromDivIsEmpty boolean is False, we concatenate to it only special keywords
     *     10101 => FooQix**
     */
    private String addFromDigits(int number, boolean fromDivIsEmpty) {
        StringBuilder newstring = new StringBuilder();
        String string = String.valueOf(number);
        for (int i = 0; i < string.length(); i++) {
            String currDigit = Character.toString(string.charAt(i));
            if (fromDivIsEmpty)
                newstring.append(this.digitsToString.getOrDefault(currDigit, currDigit));
            else
                newstring.append(this.digitsToString.getOrDefault(currDigit, ""));
        }
        return newstring.toString();
    }

    private String compute(int number) {
        String stringFromDiv = addFromDivisibility(number);
        String stringFromDigits = addFromDigits(number, stringFromDiv.equals(""));
        if (stringFromDiv.equals("") && stringFromDigits.equals(""))
            return String.valueOf(number);
        return stringFromDiv + stringFromDigits;
    }

    public void exec(int maxLimit) {
        for (int i = 0; i < maxLimit; i++) {
            System.out.println(i + " => " + compute(i));
        }
    }
}
