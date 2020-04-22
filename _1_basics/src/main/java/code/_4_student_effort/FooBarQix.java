package code._4_student_effort;

import java.util.Scanner;

public class FooBarQix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        compute2(n);
        scan.close();
    }

    public static void compute2(int n){
        int i,ok=0;
        for(i=1;i<=n;i++){
            if(i%3==0){
                System.out.print("Foo");
                ok=1;
            }
            if(i%5==0) {
                System.out.print("Bar");
                ok=1;
            }
            if(i%7==0) {
                System.out.print("Qix");
                ok=1;
            }
            int x=i;
            while(x>0){
                if(x%10==3) {
                    System.out.print("Foo");
                    ok=1;
                }
                else if(x%10==5) {
                    System.out.print("Bar");
                    ok=1;
                }
                else if(x%10==7) {
                    System.out.print("Qix");
                    ok=1;
                }
                else if(x%10==0) {
                    System.out.print("*");
                    ok=1;
                }
                x=x/10;
            }
            if(ok!=1)
                System.out.print(i);
            ok=0;
            System.out.println();
        }
    }
}

