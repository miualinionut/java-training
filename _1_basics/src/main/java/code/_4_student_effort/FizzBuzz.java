package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args)
    {
        for(int nr = 1; nr <= 100; nr++)
        {
            if(nr % 3 == 0)
            {
                System.out.print("Fizz");
                if(nr % 5 == 0)
                {
                    System.out.print("Buzz");
                }
            }
            else if(nr % 5 == 0)
            {
                System.out.print("Buzz");
            }
            else if(nr % 7 == 0) //Stage 2
            {
                System.out.print("Rizz");
            }
            else if(nr % 11 == 0)
            {
                System.out.print("Jazz");
            }
            else
            {
                System.out.print(nr);
            }
            System.out.print(", ");
        }
    }
}
