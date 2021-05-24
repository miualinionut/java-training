package code._4_student_effort;

public class FooBarQix {

    public static String compute(int n){

        String s = "";


        if(n % 3 == 0)
            s += "Foo";
        if(n % 5 == 0)
            s += "Bar";
        if(n % 7 == 0)
            s += "Qix";


        char[] number = String.valueOf(n).toCharArray();

        for (char digit:number){
            if(digit == '3') s += "Foo";
            if(digit == '5') s += "Bar";
            if(digit == '7') s += "Qix";
        }
        if(s.isEmpty()) s += String.valueOf(number);

        return s;

    }
    public static String compute2(int n){

        String s = "";
        boolean isDivisible = false;


        if(n % 3 == 0)
            s += "Foo";
        if(n % 5 == 0)
            s += "Bar";
        if(n % 7 == 0)
            s += "Qix";
        if(n % 3 == 0 || n % 5 == 0 || n % 7 == 0)
            isDivisible = true;


        char[] number = String.valueOf(n).toCharArray();

        for (char digit:number){
            if(digit == '3') s += "Foo";
            else if(digit == '5') s += "Bar";
            else if(digit == '7') s += "Qix";
            else if(digit == '0') s += "*";
            else if(!isDivisible) s += digit;
        }
        if(s.isEmpty()) s += String.valueOf(number);

        return s;

    }
}
