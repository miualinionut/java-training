package code._4_student_effort;

public class FizzBuzz {

    private static int fizz = 3;
    private static int buzz = 5;
    private static int rizz = 7;
    private static int jazz = 11;

    public static void main(String[] args) {
        System.out.println("Stage 1:");

        // using Integer instead of int to get access to the toString method
        for(Integer i = 1; i <= 100; i++) {
            String output = "";

            if(i % fizz == 0)
                output += "Fizz";
            if(i % buzz == 0)
                output += "Buzz";
            if(output == "")
                output += i.toString();

            if(i == 100) {
                System.out.print(output);
                break;
            }

            System.out.print(output + ' ');
        }

        System.out.println();
        System.out.println("Stage 2:");
        for(Integer i = 1; i <= 100; i++) {
            String output = "";

            if(i % fizz == 0)
                output += "Fizz";
            if(i % buzz == 0)
                output += "Buzz";
            if(i % rizz == 0)
                output += "Rizz";
            if(i % jazz == 0)
                output += "Jazz";
            if(output == "")
                output += i.toString();

            if(i == 100) {
                System.out.print(output);
                break;
            }

            System.out.print(output + ' ');
        }
    }
}