package code._4_student_effort;

import java.util.Scanner;

public class Challenge2 {

    //Stage 1- requirements:
    static public String compute(int i) {
        String aux= new String();
        if(i%3 == 0) aux = aux +"Foo";
        if(i%5 == 0) aux = aux +"Bar";
        if(i%7 == 0) aux = aux +"Qix";

        int reversed = reverseNumber(i);
        while(reversed != 0) {
            if(reversed %10 ==3) aux = aux+"Foo";
            if(reversed %10 ==5) aux = aux+"Bar";
            if(reversed %10 ==7) aux = aux+"Qix";
            reversed = reversed/10;
        }

        if(aux.length() == 0) aux = aux+i;

        return aux;
    }

    public static int reverseNumber(int i){
        int result=0;
        while(i != 0){
            result = result*10 +i%10;
            i=i/10;
        }
        return result;
    }

    //Stage 2- new requirements:
    public static  String compute2(int i){

        String result1 = compute(i);
        StringBuilder result2 = new StringBuilder(result1);
        int nrOfDiv = 0;

        for(int j = 0; j < result1.length(); j++){
            if(result1.charAt(j) == '0')  result2.setCharAt(j,'0');
        }

        if(i%3 == 0) nrOfDiv++;
        if(i%5 == 0) nrOfDiv++;
        if(i%7 == 0) nrOfDiv++;

        String aux = new String();
        int reversed = reverseNumber(i);
        while(  reversed != 0 ){
            if(reversed%10 == 3) aux = aux + "Foo";
            if(reversed%10 == 5) aux = aux + "Bar";
            if(reversed%10 == 7) aux = aux + "Qix";
            if(reversed%10 == 0) aux = aux + "*";

            reversed = reversed/10;
        }
        result2.replace(nrOfDiv*3 ,result2.length(),aux);

       String finalResult = new String(result2);
        return finalResult;
    }

    public static void main(String[] args) {

        Scanner tast = new Scanner(System.in);
        int a = tast.nextInt();

        String result = compute(a);
        System.out.println(result);

        String result2 = compute2(a);
        System.out.println(result2);

    }
}
