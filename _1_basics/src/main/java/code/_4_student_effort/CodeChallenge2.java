package code._4_student_effort;

public class CodeChallenge2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 15, 21, 33, 51, 53};

        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i] + " => " + compute(arr1[i]));
        }

        System.out.println();
        int[] arr2 = {101, 303, 105, 10101};
        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i] + " => " + compute2(arr2[i]));
        }
    }

    public static String compute(int number){
        String output = "";
        String output2 = "";

        // check divisibility
        if(number % 3 == 0){
            output += "Foo";
        }
        if(number % 5 == 0){
            output += "Bar";
        }
        if(number % 7 == 0){
            output += "Qix";
        }

        // check each digit
        int auxNumber = number;
        while(auxNumber > 0){
            int digit = auxNumber % 10;
            if(digit == 3){
                output2 = "Foo" + output2;
            }
            else if(digit == 5){
                output2 = "Bar" + output2;
            }
            else if(digit == 7){
                output2 = "Qix" + output2;
            }
            auxNumber /= 10;
        }

        // if the String is empty (has length of 0), get the value of number
        output += output2;
        if(output.isEmpty()){
            output = String.valueOf(number);
        }

        return output;
    }

    public static String compute2(int number){
        String output = "";

        // if the previous rules are not meet, replaces each 0 with *
        if(compute(number).equals(String.valueOf(number))){
            while(number > 0){
                int digit = number % 10;
                if(digit == 0){
                    output = "*" + output;
                }
                else {
                    output = digit + output;
                }
                number /= 10;
            }
        }
        // if the previous rules are meet, implement the new one as well
        else {
            // check divisibility
            if(number % 3 == 0){
                output += "Foo";
            }
            if(number % 5 == 0){
                output += "Bar";
            }
            if(number % 7 == 0){
                output += "Qix";
            }

            String output2 = "";
            // check each digit
            while(number > 0){
                int digit = number % 10;
                if(digit == 3){
                    output2 = "Foo" + output2;
                }
                else if(digit == 5){
                    output2 = "Bar" + output2;
                }
                else if(digit == 7){
                    output2 = "Qix" + output2;
                }
                else if(digit == 0){
                    output2 = "*" + output2;
                }
                number /= 10;
            }

            output += output2;
        }

        return output;
    }
}
