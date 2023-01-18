package code._4_student_effort.fooBarQix;

public class FooBarQix {
    public String compute(int number){
        StringBuilder s = new StringBuilder();
        if(number % 3 == 0){
            s.append("Foo");
        }
        if (number % 5 == 0) {
            s.append("Bar");
        }
        if (number % 7 == 0) {
            s.append("Qix");
        }
        char[] digits = String.valueOf(number).toCharArray();
        for(char digit : digits){
            if(digit == '3'){
                s.append("Foo");
            }
            if (digit == '5') {
                s.append("Bar");
            }
            if (digit == '7') {
                s.append("Qix");
            }
        }
        if(s.length() == 0)
            s.append(String.valueOf(number));
        return s.toString();
    }

    public String compute2(int number){
        StringBuilder s = new StringBuilder();
        boolean isDivisile = false;
        if(number % 3 == 0){
            s.append("Foo");
            isDivisile = true;
        }
        if (number % 5 == 0) {
            s.append("Bar");
            isDivisile = true;
        }
        if (number % 7 == 0) {
            s.append("Qix");
            isDivisile = true;
        }
        char[] digits = String.valueOf(number).toCharArray();
        for(char digit : digits){
            if(digit == '3')
                s.append("Foo");
            else if (digit == '5')
                s.append("Bar");
            else if (digit == '7')
                s.append("Qix");
            else if (digit == '0')
                s.append("*");
            else if (!isDivisile)
                s.append(digit);
        }
        return s.toString();
    }
}
