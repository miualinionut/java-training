package code._4_student_effort.FooBarQix;

public class FooBarQix {

    public String Compute(int number){
        StringBuilder str = new StringBuilder();
        int digit, inv = 0, aux = number;

        if(number % 3 == 0)
            str.append("Foo");
        else if(number % 5 == 0)
            str.append("Bar");
        else if(number % 7 == 0)
            str.append("Qix");

        while(number != 0) {
            inv = inv * 10 + number % 10;
            number /= 10;
        }

        while(inv != 0){
            digit = inv % 10;
            if(digit == 3)
                str.append("Foo");
            else if(digit == 5)
                str.append("Bar");
            else if(digit == 7)
                str.append("Qix");

            inv /= 10;
        }

        if(str.toString().isEmpty()) {
            str.append(aux);
        }

        return str.toString();
    }
}
