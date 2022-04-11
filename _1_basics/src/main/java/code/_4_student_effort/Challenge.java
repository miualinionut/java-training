package main.java.code._4_student_effort;
import java.util.ArrayList;

public class Challenge {
    public void FizzBuzz() {
        // FizzBuzz

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 7 == 0) {
                System.out.println("Rizz");
            } else if (i % 11 == 0) {
                System.out.println("Jazz");
            } else
                System.out.println(i);
        }
    }

    public String compute(int number) {

        String computedString = "";
        if (number % 3 == 0)
            computedString += "Foo";
        if (number % 5 == 0)
            computedString += "Bar";
        if (number % 7 == 0)
            computedString += "Qix";

        char[] cifre = String.valueOf(number).toCharArray();
        for (char cifra : cifre) {
            if (cifra == '3')
                computedString += "Foo";
            else if (cifra == '5')
                computedString += "Bar";
            else if (cifra == '7')
                computedString += "Qix";
            else if (cifra == '0')
                computedString += "*";
        }

        return computedString;
    }

    public int pairsOf2(ArrayList<Integer> numbers){
        int pairs = 0;
        for (int i = 0; i < numbers.size()-1; i++){
        System.out.println(numbers.get(i));
        for (int j = i + 1; j < numbers.size(); j++){
            if (numbers.get(i) + numbers.get(j) == 0){
                numbers.remove(j);
                pairs++;
            }
          }
        }
        return pairs;
    }

    public int pairsOf3(ArrayList<Integer> numbers){
        int pairs = 0;
        for (int i = 0; i < numbers.size()-2; i++){
        System.out.println(numbers.get(i));
        for (int j = i + 1; j < numbers.size()-1; j++){
        	for (int k = j + 1; k < numbers.size(); k++){
            if (numbers.get(i) + numbers.get(j) + numbers.get(k) == 0){
                numbers.remove(j);
                numbers.remove(k);
                pairs++;
            }
            if(numbers.size()<3)
            break;
            }
          }
        }
        return pairs;
    }
}