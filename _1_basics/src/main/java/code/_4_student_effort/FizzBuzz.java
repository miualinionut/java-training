package code._4_student_effort;

public class FizzBuzz {

    public void printNumbers () {
        for (int i = 1; i <= 100; i++) {
            boolean x=false;
            if (i%3 == 0) {
                System.out.print("FIZZ");
                x=true;
            }
            if (i%5 == 0) {
                System.out.print("BUZZ");
                x=true;
            }
            if (i%7 == 0){
                System.out.print("RIZZ");
                x=true;
            }
            if (i%11 == 0){
                System.out.print("JAZZ");
                x=true;
            }
            if (!x) System.out.print(i);
            System.out.println();
        }
    }
}
