package code._4_student_effort;

public class FooBarQix {

    private static int star = 0;
    private static int foo  = 3;
    private static int bar  = 5;
    private static int qix  = 7;

    private static String compute(Integer num) {
        String output = "";

        if(num % foo == 0)
            output += "Foo";
        if(num % bar == 0)
            output += "Bar";
        if(num % qix == 0)
            output += "Qix";

        // convert the Integer to a string so we can iterate through its characters
        String str_num = num.toString();
        for(int i = 0; i < str_num.length(); i++) {
            // number + 48 = the ASCII representation of the said number
            if(str_num.charAt(i) == foo + 48)
                output += "Foo";
            if(str_num.charAt(i) == bar + 48)
                output += "Bar";
            if(str_num.charAt(i) == qix + 48)
                output += "Qix";
        }

        return output;
    }

    private static String compute2(Integer num) {
        String output = "";

        if(num % foo == 0)
            output += "Foo";
        if(num % bar == 0)
            output += "Bar";
        if(num % qix == 0)
            output += "Qix";

        // convert the Integer to a string so we can iterate through its characters
        String str_num = num.toString();
        for(int i = 0; i < str_num.length(); i++) {
            // number + 48 = the ASCII representation of the said number
            if(str_num.charAt(i) == star + 48)
                output += "*";
            if(str_num.charAt(i) == foo + 48)
                output += "Foo";
            if(str_num.charAt(i) == bar + 48)
                output += "Bar";
            if(str_num.charAt(i) == qix + 48)
                output += "Qix";
        }

        return output;
    }

    public static void main(String[] args) {
        // modify the numbers to be computed here
        Integer input  = 33;
        Integer input2 = 330;

        System.out.println(compute(input));
        System.out.println(compute2(input2));
    }
}
