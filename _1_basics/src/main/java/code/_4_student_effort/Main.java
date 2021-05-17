package code._4_student_effort;

import java.security.PublicKey;

public class Main {

    String result="";

    public String compute1(int input){
        if(input % 3 == 0 && input == 3){
            result = "FooFoo";
        }else if(input % 3 == 0)
            return result = "Foo";

        if(input % 5 == 0 && input == 5){
            result = "BarBar";
        }else if(input % 5 == 0)
            return result = "Bar";

        if(input % 7 == 0 && input == 7){
            result = "QixQix";
        }else if(input % 7 == 0)
            return result = "Qix";

        return result;
    }



    public static void main(String[] args) {
        //TODO put your code changes in here
    Main main = new Main();
        System.out.println(main.compute1(15));
    }
}

