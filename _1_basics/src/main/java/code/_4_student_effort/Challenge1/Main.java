package code._4_student_effort.Challenge1;

//FizzBuzz - Challenge 1
public class Main {

  public static void main(String[] args) {
    for(int i=1;i<=100;i++)
    {
      if((i%3==0)&&(i%5==0))
      {
        System.out.println("FizzBuzz");
      }
      else if(i%5==0)
      {
        System.out.println("Buzz");
      }
      else if(i%3==0)
      {
        System.out.println("Fizz");
      }

      if(i%7==0)
      {
        System.out.println("Rizz");
      }
      else if(i%11==0)
      {

        System.out.println("Jazz");
      }
      else
        System.out.println(i);

    }
  }
}
