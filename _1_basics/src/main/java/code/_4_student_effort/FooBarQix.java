package code._4_student_effort;

import javax.swing.*;

public class FooBarQix {
    static String compute2 (int number) {
        String output = "";
        if (number % 3 == 0)
            output += "Foo";
        if (number % 5 == 0)
            output += "Bar";
        if (number % 7 == 0)
            output += "Qix";
        char charNumber[] = String.valueOf(number).toCharArray();
        for (char digit: charNumber) {
            if (digit=='3')
                output+="Foo";
            if (digit=='5')
                output+="Bar";
            if (digit=='7')
                output+="Qix";
            if (digit=='0')
                output+="*";
        }
        boolean onlyStars=true;
        char charOutput[] = output.toCharArray();
        for(char character:charOutput){
            if (character!='*'){
                onlyStars = false;
                break;
            }
        }
        if (onlyStars){
            output="";
            for (char digit:charNumber) {
                if (digit=='0')
                    output+='*'; else
                    output+=digit;
            }
        }
        if (output == "")
            return String.valueOf(number);
        return output;
    }
    static String compute (int number) {
        String divisible = "";
        if (number % 3 ==0)
            divisible+="Foo";
        if (number % 5 ==0)
            divisible+="Bar";
        if (number % 7 ==0)
            divisible+="Qix";
        String contains = "";
        int numberCopy=number;
        while (number!=0){
            int digit = number %10;
            if (digit==3) {
                contains = "Foo"+contains;
            }
            if (digit==5) {
                contains = "Bar"+contains;
            }
            if (digit==7) {
                contains = "Qix"+contains;
            }
            number/=10;
        }
        if (divisible != "" || contains != "")
            return divisible + contains;
        return String.valueOf(numberCopy);
    }
    public static void main(String[] args) {
        System.out.println(compute2(105));
    }
}
