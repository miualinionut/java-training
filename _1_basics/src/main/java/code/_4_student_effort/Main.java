package code._4_student_effort;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        //CodeChallenge1
        //Stage 1

        System.out.println("Code Challenge 1 - Stage 1");
        for(int i=1;i<=100;i++){
            if(i%3 == 0)
                System.out.print("Fizz ");
            if(i%5 == 0)
                System.out.print("Buzz ");
            if(i%5 != 0 && i%3 != 0)
                System.out.print(i + " ");
        }

        //Stage 2

        System.out.println("Code Challenge 1 - Stage 2");
        for(int i=1;i<=100;i++){
            if(i%3 == 0)
                System.out.print("Fizz ");
            if(i%5 == 0)
                System.out.print("Buzz ");
            if(i%7 == 0)
                System.out.print("Rizz ");
            if(i%11 == 0)
                System.out.print("Jazz ");
            if(i%3 != 0 && i%5 != 0 && i%7 != 0 && i%11 != 0)
                System.out.print(i + " ");
        }

        //Code challenge 2
        //Stage 1
        System.out.println("Code Challenge 2 - Stage 1");

        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,13,15,21,33,51,53};

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i] + " => " + compute(numbers[i]));
        }

        System.out.println("Code Challenge 2 - Stage 2");

        int[] numbers2 = new int[]{101,303,105,10101};
        for(int i=0;i<numbers2.length;i++){
            System.out.println(numbers2[i] + " => " + compute2(numbers2[i]));
        }

        System.out.println("Code Challenge 3");
        int[] input = new int[]{5,9,-5,7,-5};
        System.out.println(twoSum(input));
    }

    protected static String compute(int number){
        String nr = Integer.toString(number);
        String result = "";
        if(number % 3 == 0)
            result = result + "Foo";
        if(number % 5 == 0)
            result = result + "Bar";
        if(number % 7 == 0)
            result = result + "Qix";

        for(int i=0;i<nr.length();i++){
            if(nr.charAt(i) == '3')
                result = result + "Foo";
            else if(nr.charAt(i) == '5')
                result += "Bar";
            else if(nr.charAt(i) == '7')
                result += "Qix";
        }
        if(result == "")
            return nr;
        return result;
    }

    protected static String compute2(int number){
        String nr = Integer.toString(number);
        String result = "";

        if(number % 3 == 0)
            result = result + "Foo";
        if(number % 5 == 0)
            result = result + "Bar";
        if(number % 7 == 0)
            result = result + "Qix";

        for(int i=0;i<nr.length();i++){
            if(nr.charAt(i) == '3')
                result = result + "Foo";
            else if(nr.charAt(i) == '5')
                result += "Bar";
            else if(nr.charAt(i) == '7')
                result += "Qix";
            else if(nr.charAt(i) == '0')
                result += "*";
        }
        if(result == "")
            return nr;
        if(result.equals("*")){
            result = "";
            for(int i=0;i<nr.length();i++) {
                if (nr.charAt(i) == '0')
                    result += "*";
                else
                    result += nr.charAt(i);
            }
        }
        return result;
    }

    protected static int twoSum(int[] numbers){
        //complexitate finala O(n)
        int pairs = 0;
        int countZeros = 0;

        // tratam cazul in care avem perechi de forma [0,0]
        for(int i=0;i< numbers.length;i++){
            if(numbers[i] == 0)
                countZeros++;
        }

        if(countZeros % 2 == 0)
            pairs += countZeros / 2;

        //parcurg vectorul -> o(n)
        //pun elem negative in map
        //verific daca complementele numerelor pozitive
        //din vector sunt in map si calculez perechile
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();

        for(int i = 0;i < numbers.length; i++){
            if(numbers[i] < 0){
                if(mp.containsKey(numbers[i]))
                {
                    int value = mp.get(numbers[i]) + 1;
                    mp.put(numbers[i],value);
                }
                else
                    mp.put(numbers[i],1);
            }
        }

        for(int i=0;i< numbers.length;i++){
            if(numbers[i] > 0){
                if(mp.containsKey(numbers[i] * (-1))){
                    int value = mp.get(numbers[i] * (-1));
                    if(value > 0){
                        pairs++;
                        value--;
                        mp.put(numbers[i] * (-1),value);
                    }
                }
            }
        }

        return pairs;
    }

    protected static int threeSum(int[] numbers){
        int pairs = 0;
        return pairs;
    }


}

