package code._4_student_effort;

import com.sun.nio.sctp.SctpSocketOption;

public class Main {

    public static String Compute(int j){
        String a = "";
        String f = "Foo";
        String b = "Bar";
        String q = "Qix";
        if(j % 3 == 0){
            a += f;
        }
        else if(j % 5 == 0){
            a += b;
        }
        else if(j % 7 == 0){
            a += q;
        }
        else{
            a += j;
        }

        while(j!=0){

            if((j%10) == 3) {
                a += f;
                j = j/10;
                continue;
            }
            else if((j%10) == 5) {
                a += b;
                j = j/10;
                continue;
            }
            else if((j%10) == 7) {
                a += q;
                j = j/10;
                continue;
            }

            j = j/10;
        }

        return a;
    }
    public static void main(String[] args) {
        //TODO put your code changes in here
        // 3 Foo
        // 5 Bar
        // 7 Qix
        //
        //FooBarQix

        for(int i = 1; i<=53; i++){

            String b = Compute(i);
            System.out.println(b);

        }

    }

}
