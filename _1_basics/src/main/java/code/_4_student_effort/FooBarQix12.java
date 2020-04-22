package code._4_student_effort;
import java.util.*;
public class FooBarQix12 {
    static String compute(int n){
        String s = new String();
        String nr = new String();
        int i=0;
        if(n%3==0){s+="Foo";i=1;}
        if(n%5==0){s+="Bar";i=1;}
        if(n%7==0){s+="Qix";i=1;}
        int cn=n;
        nr+=n;
        for (int j = 0; j < nr.length(); j++) {
            if(nr.charAt(j)=='3'){s+="Foo";i=1;}
            if(nr.charAt(j)=='5'){s+="Bar";i=1;}
            if(nr.charAt(j)=='7'){s+="Qix";i=1;}
        }
        if(i==1)return s;
        else return nr;
    }
    static String compute2(int n){
        String s = new String();
        String nr = new String();
        int i=0;
        if(n%3==0){s+="Foo";i=1;}
        if(n%5==0){s+="Bar";i=1;}
        if(n%7==0){s+="Qix";i=1;}
        int cn=n;
        nr+=n;
        for (int j = 0; j < nr.length(); j++) {
            if(nr.charAt(j)=='3'){i=1;}
            if(nr.charAt(j)=='5'){i=1;}
            if(nr.charAt(j)=='7'){i=1;}
        }
        if(i==1){
        for (int j = 0; j < nr.length(); j++) {
            if(nr.charAt(j)=='0'){s+="*";}
            if(nr.charAt(j)=='3'){s+="Foo";}
            if(nr.charAt(j)=='5'){s+="Bar";}
            if(nr.charAt(j)=='7'){s+="Qix";}
        }}
        else {
            for (int j = 0; j < nr.length(); j++) {
                if (nr.charAt(j) == '0') { s += "*"; }
                else s+=nr.charAt(j);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        int n=f.nextInt();
        while (n!=-1) {
            System.out.println(compute(n));
            System.out.println(compute2(n));
            n=f.nextInt();
        }
    }
}
