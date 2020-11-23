package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args)
    {

        for(int nr = 1; nr <= 110; nr++)
        {
            boolean divizibil = false;
            if(nr % 3 == 0)
            {
                System.out.print("Fizz");
                divizibil = true;
            }
            if(nr % 5 == 0)
            {
                System.out.print("Buzz");
                divizibil = true;
            }
            if(nr % 7 == 0) //Stage 2
            {
                System.out.print("Rizz");
                divizibil = true;
            }
            if(nr % 11 == 0)
            {
                System.out.print("Jazz");
                divizibil = true;
            }
            if(!divizibil)
            {
                System.out.print(nr);
            }
            System.out.print(", ");
        }
    }
}
