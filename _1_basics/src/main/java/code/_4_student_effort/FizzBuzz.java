package code._4_student_effort;

public class FizzBuzz {

    public static void main(String[] args) {

        for(int i=1;i<=100;i++){


            boolean isPrinted=false;
            if(i%3==0) {
                System.out.println("Fizz");
                isPrinted=true;
            }
            if(i%5==0){
                System.out.println("Buzz");
                isPrinted=true;
            }
            if(i%7==0){
                System.out.println("Rizz");
                isPrinted=true;
            }
            if(i%11==0){
                System.out.println("Jazz");
                isPrinted=true;
            }
            if(isPrinted==false) System.out.println(i);
            System.out.println();
        }
    }
}
