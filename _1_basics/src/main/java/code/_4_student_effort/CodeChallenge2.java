package code._4_student_effort;

public class CodeChallenge2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 15, 21, 33, 51, 53};

        for(int i = 0; i < arr1.length; i++){
            String output = compute(arr1[i]);
            // when the returned string is "" (has a length of 0), the output is the number
            output = output.length() == 0 ? Integer.toString(arr1[i]) : output;

            System.out.println(arr1[i] + " => " + output);
        }

        System.out.println();
        int[] arr2 = {101, 303, 105, 10101};
        for(int i = 0; i < arr2.length; i++){
            String output = compute2(arr2[i]);
            // when the returned string is "" (has a length of 0), the output is the number
            output = output.length() == 0 ? Integer.toString(arr2[i]) : output;

            System.out.println(arr2[i] + " => " + output);
        }
    }

    public static String compute(int number){
        String output1 = "";
        String output2 = "";

        // check if divisible
        if(number % 3 == 0){
            output1 += "Foo";
        }
        if(number % 5 == 0){
            output1 += "Bar";
        }
        if(number % 7 == 0){
            output1 += "Qix";
        }

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
            number /= 10;
        }

        return output1 + output2;
    }

    public static String compute2(int number){
        String output1 = "";
        String output2 = "";

        // check if divisible
        if(number % 3 == 0){
            output1 += "Foo";
        }
        if(number % 5 == 0){
            output1 += "Bar";
        }
        if(number % 7 == 0){
            output1 += "Qix";
        }

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
        return output1 + output2;
    }
}
