package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args)
    {
        int i;
        for(i=1; i<=100; i++)
        {
                if (i % 3 == 0)
                {
                    System.out.println("Fizz");
                    //i++;
                }
               // else
                    if (i % 5 == 0)
                    {
                        System.out.println("Buzz");
                        //i++;
                    }
                    //else
                    if (i % 7 == 0)
                    {
                        System.out.println("Rizz");
                        //i++;
                    }
                    //else
                    if (i % 11 == 0)
                    {
                        System.out.println("Jazz");
                        //i++;
                    }
                    //else
                        System.out.println(i);
                        if (i % 3 == 0 && i % 5 == 0)
                        {
                            System.out.println("FizzBuzz");
                            //i++;
                        }
                //else
                   // System.out.println(i);
        }
    }
}
