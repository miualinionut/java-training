package code._4_student_effort;

public class Challenge_2 {

    public boolean containsDigit(int n, int d){
        while (n != 0){
            if (n%10 == d) {return true;}
            n = n/10;
        }
        return false;
    }
    public void printNumbers (int n){
        for (int i = 1; i <= n; i++){
            boolean x=false;
            if (i%3 == 0) {
                System.out.print("Foo");
                x=true;
            }
            if (i%5 == 0) {
                System.out.print("Bar");
                x=true;
            }
            if (i%7 == 0) {
                System.out.print("Qix");
                x=true;
            }
            if (containsDigit(i,3)) {
                System.out.print("Foo");
                x=true;
            }
            if (containsDigit(i,5)) {
                System.out.print("Bar");

            }
            if (containsDigit(i,7)) {
                System.out.print("Qix");
                x=true;
            }
            if (!x) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
