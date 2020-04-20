package code._4_student_effort;

public class FooBarQix {
    static int ReverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    static String compute(int i) {
        String output = "";
        output = output + i;
        output = output + " =>";


        if (i % 3 == 0)
            output = output + "Foo";


        if (i % 5 == 0)
            output = output + "Bar";


        if (i % 7 == 0)
            output = output + "Qix";



        int reversed = ReverseNumber(i);
        while (reversed != 0) {
            if (reversed % 10 == 3) {
                output = output + "Foo";
            }

            if (reversed % 10 == 5) {
                output = output + "Bar";
            }

            if (reversed % 10 == 7) {
                output = output + "Qix";
            }
            reversed = reversed / 10;

        }
        return output;
    }

    static String compute2(int i) {
        int reversed = 0;
     
        String output = "";
        output = output + i;
        output = output + " =>";


        if (i % 3 == 0)
            output = output + "Foo";

        if (i % 5 == 0)
            output = output + "Bar";

        if (i % 7 == 0)
            output = output + "Qix";


        reversed = ReverseNumber(i);

        while (reversed != 0) {
            if (reversed % 10 == 3) {
                output = output + "Foo";
            }

            if (reversed % 10 == 5) {
                output = output + "Bar";
            }

            if (reversed % 10 == 7) {
                output = output + "Qix";
            }

            if (reversed % 10 == 0) {
                output = output + "*";
            }
            reversed = reversed / 10;
        }

        return output;
    }
}




