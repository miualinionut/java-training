package code._4_student_effort;


import java.util.Scanner;

public class FooBarQix {
    static String compute(int number){
        String output ="";
        if(number%3==0){
            output +="Foo";
        }
        if(number%5==0){
            output += "Bar";
        }
        if(number%7==0){
            output += "Qix";
        }
        int invers=0;
        while(number!=0)
        {
            invers = invers * 10 + number%10;
            number/=10;
        }
        while(invers!=0){
            if(invers%10==3){
                output +="Foo";
            }
            if(invers%10==5){
                output += "Bar";
            }
            if(invers%10==7){
                output += "Qix";
            }
            invers/=10;
        }

        return output;
    }
    static String compute2(int number){
        String output ="";
        if(number%3==0){
            output +="Foo";
        }
        if(number%5==0){
            output += "Bar";
        }
        if(number%7==0){
            output += "Qix";
        }
        int invers=0;
        while(number!=0)
        {
            invers = invers * 10 + number%10;
            number/=10;
        }
        while(invers!=0){
            if(invers%10==3){
                output +="Foo";
            }
            if(invers%10==0){
                output +="*";
            }
            if(invers%10==5){
                output += "Bar";
            }
            if(invers%10==7){
                output += "Qix";
            }
            invers/=10;
        }

        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(compute2(x));
    }
}
