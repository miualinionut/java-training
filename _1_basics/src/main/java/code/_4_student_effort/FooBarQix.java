    package code._4_student_effort;
    import java.util.Scanner;

    public class FooBarQix {

        static String compute(int x) {

            String result = "";
            if (x % 3 == 0) result += "Foo";

            if (x % 5 == 0) result += "Bar";

            if (x % 7 == 0) result += "Qix";

            String x_string = Integer.toString(x);


            for (int i = 0; i < x_string.length(); i++) {
                if (x_string.charAt(i) == '3') {
                    result += "Foo";
                }
                if (x_string.charAt(i) == '5') {
                    result += "Bar";
                }
                if (x_string.charAt(i) == '7') {
                    result += "Qix";
                }

            }
            if (result == "")
                return x_string;
            else return result;
        }

        static String compute2(int x) {

            String result = "";
            if (x % 3 == 0) result += "Foo";

            if (x % 5 == 0) result += "Bar";

            if (x % 7 == 0) result += "Qix";

            String x_string = Integer.toString(x);


            for (int i = 0; i < x_string.length(); i++) {
                if (x_string.charAt(i) == '3') {
                    result += "Foo";
                }
                if (x_string.charAt(i) == '5') {
                    result += "Bar";
                }
                if (x_string.charAt(i) == '7') {
                    result += "Qix";
                }
                if (x_string.charAt(i) == '0') {
                    result += "*";
                }
            }


            if (result == "")
                return x_string;
            else return result;

        }

        public static void main(String[] args) {

            int x;

            Scanner numar = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Type a number:");
            x = numar.nextInt(); // Read user input

            System.out.println(compute2(x));

        }


    }

