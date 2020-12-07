package code._4_student_effort;

public class FooBarQix {
    public FooBarQix() {}; //default constructor

    String compute (int number) {
        String message = "";
        String stringNumber = Integer.toString(number);
        int digit;

        if ((number % 3 == 0) && (number % 5 != 0) && (number % 7 != 0))
            message = "Foo";
        else if ((number % 5 == 0) && (number % 3 != 0) && (number % 7 != 0))
            message = "Bar";
        else if ((number % 7 == 0) && (number % 5 != 0) && (number % 3 != 0))
            message = "Qix";
        else if (((number % 15 == 0) && (number % 7 != 0)))
            message = "FooBar";
        else if (((number % 21 == 0) && (number % 5 != 0)))
            message = "FooQix";
        else if ((((number % 35 == 0) && (number % 3 != 0))))
            message = "BarQix";
        else if(!stringNumber.contains("3") && !stringNumber.contains("5") && !stringNumber.contains("7"))
            return stringNumber;

        while (number != 0) {
            digit = number % 10;

            if (digit == 3)
                message += "Foo";
            else if (digit == 5)
                message += "Bar";
            else if (digit == 7)
                message += "Qix";
            String substring = message.substring(3);
            number = number / 10;
        }

        return message;
    }

}
