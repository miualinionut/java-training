package code._4_student_effort;

public class CodeChallenge1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            String output = "";
            if(i % 3 == 0)
                output += "Fizz";
            if(i % 5 == 0)
                output += "Buzz";
            if(i % 7 == 0)
                output += "Rizz";
            if(i % 11 == 0)
                output += "Jazz";
            // when the output string is "" (has a length of 0), the output is the number
            output = output.length() == 0 ? Integer.toString(i) : output;
            System.out.println(i + " => " + output);
        }
    }
}
