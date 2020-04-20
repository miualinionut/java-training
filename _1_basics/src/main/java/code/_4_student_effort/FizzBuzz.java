package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args){
        int i = 0;
        Integer x;
        while (++i < 101) {
            if (i % 3 == 0)
                System.out.print("Fizz");
            if(i % 5 == 0)
                System.out.print("Buzz");
            if(i % 3 != 0 && i % 5 != 0)
                System.out.print(i);
            if(i != 100)
            System.out.print(", ");
        }
    }
}
