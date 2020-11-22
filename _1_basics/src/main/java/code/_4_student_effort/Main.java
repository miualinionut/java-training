package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    FizzBuzz(100);

  }

  private static void FizzBuzz(int n){
    for(int i=1; i<n; i=i+1)
    {
     if(((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) != 0) && ((i % 11) != 0))
       System.out.println("FizzBuzz");
     else if(((i % 3) == 0) && ((i % 7) != 0) && ((i % 11) != 0))
       System.out.println("Fizz");
     else if(((i % 5) == 0) && ((i % 7) != 0) && ((i % 11) != 0))
       System.out.println("Buzz");
     else if(((i % 7) == 0) && ((i % 11) != 0))
       System.out.println("Rizz");
     else if(((i % 7) != 0) && ((i % 11) == 0))
       System.out.println("Jazz");
     else System.out.println(i);
    }
  }
}
