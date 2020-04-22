package code._4_student_effort;

public class Challenge_2 {
    public static String compute(int number) {
        String string = "";

        if (number % 3 == 0) {
            string += "Foo";
        }

        if (number % 5 == 0) {
            string += "Bar";
        }

        if (number % 7 == 0) {
            string += "Qix";
        }

        String s = "";
        int aux = number;
        while (aux != 0) {
            int digit = aux % 10;
            aux /= 10;

            if (digit == 3) {
                s = "Foo" + s;
            } else if (digit == 5) {
                s = "Bar" + s;
            } else if (digit == 7) {
                s = "Qix" + s;
            }
        }

        String result = string + s;
        if (result.length() == 0)
            return String.valueOf(number);

        return result;
    }

    public static String compute2(int number) {
        String string = "";
        boolean flag = false;

        if (number % 3 == 0) {
            string += "Foo";
            flag = true;
        }

        if (number % 5 == 0) {
            string += "Bar";
            flag = true;
        }

        if (number % 7 == 0) {
            string += "Qix";
            flag = true;
        }

        String s = "";
        int aux = number;
        while (aux != 0) {
            int digit = aux % 10;
            aux /= 10;

            if (digit == 3) {
                s = "Foo" + s;
            } else if (digit == 5) {
                s = "Bar" + s;
            } else if (digit == 7) {
                s = "Qix" + s;
            } else if (digit == 0) {
                s = "*" + s;
            } else if (flag == false) {
                s = String.valueOf(digit) + s;
            }
        }

        String result = string + s;
        if (result.length() == 0)
            return String.valueOf(number);

        return result;
    }
}
