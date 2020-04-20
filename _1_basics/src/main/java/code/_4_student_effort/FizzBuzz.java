package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args) {
        String output = "";
        for(int i = 1; i <= 100; i++){
            if (i % 3 == 0  && i % 5 == 0)
                output = output.concat("FizzBuzz ");
            else if (i % 3 == 0)
                output = output.concat("Fizz ");
            else if (i % 5 == 0)
                output = output.concat("Buzz ");
            else if (i % 7 == 0)
                output = output.concat("Rizz ");
            else if (i % 11 == 0)
                output = output.concat("Jazz ");
            else
                output = output.concat(String.valueOf(i) + " ");
        }
        System.out.println(output);
    }
}
