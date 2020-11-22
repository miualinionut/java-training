package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args) {
        String buzz,fizz,rizz,jazz;
        buzz = "Buzz";
        fizz = "Fizz";
        rizz = "Rizz";
        jazz = "Jazz";
        for(int i = 1; i <= 100 ; i++){
            if(i % 3 == 0)
                if(i % 5 == 0)
                    System.out.println(fizz+buzz+", ");
                else System.out.print(fizz+", ");

            else if(i % 5 == 0)
                    System.out.print(buzz+", ");
                else if(i % 7 == 0)
                        System.out.print(rizz+", ");
                    else if(i % 11 == 0)
                            System.out.print(jazz + ", ");
                        else System.out.print(i+", ");


        }
    }


}
