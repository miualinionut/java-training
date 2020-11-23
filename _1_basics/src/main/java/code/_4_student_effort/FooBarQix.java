package code._4_student_effort;

public class FooBarQix {
    public static String compute(int n){
        String output = "";
        if(n % 3 == 0){
            output+="Foo";
        }
        if(n % 5 == 0){
            output+="Bar";
        }
        if(n % 7 == 0){
            output+="Qix";
        }
        String digits = Integer.toString(n);
        for (int i = 0; i<digits.length(); i++){
            if(digits.charAt(i) == '3'){
                output+="Foo";
            }
            if(digits.charAt(i) == '5'){
                output+="Bar";
            }
            if(digits.charAt(i) == '7'){
                output+="Qix";
            }
        }
    if(output == ""){
        output = Integer.toString(n);
    }
    return output;}

    public static String compute2(int n){
        boolean isDivisible = false;
        String output = "";
        if(n % 3 == 0){
            output+="Foo";
            isDivisible = true;
        }
        if(n % 5 == 0){
            output+="Bar";
            isDivisible = true;
        }
        if(n % 7 == 0){
            output+="Qix";
            isDivisible = true;
        }
        String digits = Integer.toString(n);
        for (int i = 0; i<digits.length(); i++){
            if(digits.charAt(i) == '3'){
                output+="Foo";
            }
            else if(digits.charAt(i) == '5'){
                output+="Bar";
            }
            else if(digits.charAt(i) == '7'){
                output+="Qix";
            }
            else if(digits.charAt(i) == '0'){
                output+="*";
            }
            else if (isDivisible==false){
                output+=digits.charAt(i);
            }

        }
        if(output == ""){
            output = Integer.toString(n);
        }
        return output;}
}
