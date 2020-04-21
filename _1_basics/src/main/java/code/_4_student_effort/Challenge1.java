package code._4_student_effort;

public class Challenge1 {

    public static void main(String[] args) {
        //Stage 1:
        int i=1;
        while(i<=100){
            if((i%5==0) && (i%3==0)) System.out.print("FizzBuzz ");
            else if(i%5 == 0) System.out.print("Buzz ");
            else if(i%3==0) System.out.print("Fizz ");
            else System.out.print(i+" ");

            i++;
        }

        System.out.println();
        //Stage 2:
        int j=1;
        while(j<=100){
            if( (j%5 == 0) && (j%3 == 0) ) System.out.print("FizzBuzz ");
            else if(j%5 == 0 && j%11 != 0 && j%7 != 0) System.out.print("Buzz ");
            else if(j%3 == 0 && j%7 != 0 && j%11 != 0) System.out.print("Fizz ");
            else if(j%7 == 0) System.out.print("Rizz ");
            else if(j%11 == 0) System.out.print("Jazz ");
            else System.out.print(j+" ");

            j++;
        }
    }
}
