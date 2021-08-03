package code._4_student_effort;

import java.util.ArrayList;

public class Main {


    public static String compute(int number){
        boolean found=true;
        String text="";
        int copy = number;
        if(number%3==0){
            text+="Foo";
            found=false;
        }
        if(number%5==0){
            text+="Bar";
            found=false;
        }
        if(number%7==0){
            text+="Qix";
            found=false;
        }

        int inverse=0;
        while(number!=0){
            inverse=inverse*10+number%10;
            number=number/10;
        }
        while (inverse!=0){
            if(inverse%10==3) {
                text += "Foo";
                found=false;
            }
            if(inverse%10==5) {
                text += "Bar";
                found=false;
            }
            if(inverse%10==7) {
                text += "Qix";
                found=false;
            }
            inverse=inverse/10;
        }
        if(found){
            text=String.valueOf(copy);
        }
        return text;
    }

    public static String compute2(int number){
        boolean found=true;
        boolean found2=true;
        String text="";
        int copy = number;
        if(number%3==0){
            text+="Foo";
            found=false;
        }
        if(number%5==0){
            text+="Bar";
            found=false;
        }
        if(number%7==0){
            text+="Qix";
            found=false;
        }

        int inverse=0;
        while(number!=0){
            inverse=inverse*10+number%10;
            number=number/10;
        }
        while (inverse!=0){
            if(inverse%10==3) {
                text += "Foo";
                found=false;
            }
            else if(inverse%10==5) {
                text += "Bar";
                found=false;
            }
            else if(inverse%10==7) {
                text += "Qix";
                found=false;
            }
            else if(inverse%10==0) {
                text += "*";
                found2=false;
            }
            else if(found){
                text += inverse % 10;
            }
            inverse=inverse/10;
        }
        if(found&&found2){
            text=String.valueOf(copy);
        }
        return text;
    }

    public static void main(String[] args) {
        //TODO put your code changes in here

        //Code Challenge 1:

        /*for(int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.print("Fizz, ");
            }else if(i%5==0){
                System.out.print("Buzz, ");
            }else if(i%3==0){
                System.out.print("FizzBuzz, ");
            }else if(i%7==0){
                System.out.print("Rizz, ");
            }else if(i%11==0){
                System.out.print("Jazz, ");
            }else{
                System.out.print(i+", ");
            }
        }*/


        //Code Challenge 2

        /*System.out.println("Output for compute():");
        System.out.println(compute(1));
        System.out.println(compute(2));
        System.out.println(compute(3));
        System.out.println(compute(4));
        System.out.println(compute(5));
        System.out.println(compute(6));
        System.out.println(compute(7));
        System.out.println(compute(8));
        System.out.println(compute(9));
        System.out.println(compute(10));
        System.out.println(compute(13));
        System.out.println(compute(15));
        System.out.println(compute(21));
        System.out.println(compute(33));
        System.out.println(compute(51));
        System.out.println(compute(53));
        System.out.println("------------------------");
        System.out.println("Output for compute2():");
        System.out.println(compute2(101));
        System.out.println(compute2(303));
        System.out.println(compute2(105));
        System.out.println(compute2(10101));*/


        //Code Challenge 3:


        /*int[] array = {3,2,-3,-2,3,0};
        int[] verified = new int[array.length];
        int pairs=0;
        int indexes=0;
        for(int i=0;i<array.length-1;i++){
            for(int j = i+1; j< array.length-1; j++){
                boolean ok = false;
                for(int k = 0; k<indexes; k++){
                    if(verified[k] == i || verified[k] == j){
                        ok = true;
                    }
                }
                if(!ok && (array[i] + array[j] == 0)){
                    verified[indexes++] = i;
                    verified[indexes++] = j;
                    pairs++;
                    break;
                }
            }
        }
        System.out.println(pairs);*/




        //Code Challenge 4:

        /*int[] array = {-1,-1,-1,2};
        int[] verified = new int[array.length];
        int pairs=0;
        int indexes=0;
        for(int i=0;i<array.length-2;i++){
            for(int j = i+1; j< array.length-1; j++){
                for(int k = j+1; k<array.length; k++) {
                    boolean ok = false;
                    for (int p = 0; p < indexes; p++) {
                        if (verified[p] == i || verified[p] == j || verified[p] == k) {
                            ok = true;
                        }
                    }
                    if (!ok && (array[i] + array[j] + array[k]== 0)) {
                        verified[indexes++] = i;
                        verified[indexes++] = j;
                        verified[indexes++] = k;
                        pairs++;
                        break;
                    }
                }
            }
        }
        System.out.println(pairs);*/
        
    }
}
