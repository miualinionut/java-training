package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i=1;i<101;i++)
        {
            if(i%3==0||i%5==0||i%7==0||i%11==0)
            {
                if(i%3==0&&i%5==0)
                    System.out.println("FizzBuzz");
                else
                {
                    if(i%3==0)
                        System.out.println("Fizz");
                    if(i%5==0)
                        System.out.println("Buzz");
                    if(i%7==0)
                        System.out.println("Rizz");
                    if(i%11==0)
                        System.out.println("Jazz");
                }
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
