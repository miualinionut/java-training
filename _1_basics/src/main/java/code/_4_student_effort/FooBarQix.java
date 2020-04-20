package code._4_student_effort;

import static java.lang.Math.*;

public class FooBarQix {
    static String compute(int nr){
        String output = "";
        boolean returnNumber = true;
        int copy = nr;
        int digits = (int)(pow(10,(int)floor(log10(nr))));

        if (nr % 3 == 0){
            output = output.concat("Foo");
            returnNumber = false;
        }
        if (nr % 5 == 0){
            output = output.concat("Bar");
            returnNumber = false;
        }
        if (nr % 7 == 0) {
            output = output.concat("Qix");
            returnNumber = false;
        }

        //in this while loop, we take the first digit of the number, check if it is 3, 5, 7 and then remove it
        //from the number until we have no digits left
        while(copy != 0){
            if (copy / digits == 3) {
                output = output.concat("Foo");
                returnNumber = false;
            }
            else if (copy / digits == 5){
                output = output.concat("Bar");
                returnNumber = false;
            }
            else if (copy / digits == 7){
                output = output.concat("Qix");
                returnNumber = false;
            }
            copy = copy % digits;
            digits /= 10;
        }

        if (returnNumber)
            output = output.concat(String.valueOf(nr));

        return output;
    }


    public static void main(String[] args) {
        System.out.println(compute(13));
    }
}
