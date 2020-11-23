package code._4_student_effort;

public class FooBarQix {

    public static void main(String[] args) {

        int n = 1000;
        compute(n);
    }

    public static void compute(int n){

        int divide;
        for(int i=0; i<n; i++)
        {
            int number = i;
            int ok = 0;
            System.out.print(number +" => ");
            if(number%3 == 0) {
                System.out.print("Foo");
                ok = 1;
            }
            if(number%5 == 0) {
                System.out.print("Bar");
                ok = 1;
            }
            if(number%7 == 0) {
                System.out.print("Qix");
                ok = 1;
            }
            while (number > 0) {
                divide = number % 10;
                number = number / 10;
                if(divide == 5) {
                    System.out.print("Bar");
                    ok = 1;
                }
                else if(divide == 3 ){
                    System.out.print("Foo");
                    ok = 1;
                }
                else if(divide == 7) {
                    System.out.print("Qix");
                    ok = 1;
                }
            }
            number = i;
            if(ok == 0)
                System.out.print(number);
            System.out.println();

        }

    }
}
