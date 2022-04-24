package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static String Fizzbuzz(int i) {

        String s=" ";

        ArrayList<NumberWordMapping> mappings = new ArrayList<>();
        NumberWordMapping map1 = new NumberWordMapping(3, "fizz");
        NumberWordMapping map2 = new NumberWordMapping(5, "buzz");
        NumberWordMapping map3 = new NumberWordMapping(7, "rizz");
        NumberWordMapping map4 = new NumberWordMapping(15, "rfzz");

        mappings.add(map1);
        mappings.add(map2);
        mappings.add(map3);

        boolean isDiv = false;

        for(NumberWordMapping mapping : mappings){
            if(i% mapping.number==0){
                isDiv=true;
                s+=mapping.word;
            }
        }
        if(!isDiv){
            s+=String.valueOf(i);
        }


        return s;
    }

    public static void main(String[] args) {
        List<String> fizzbuzz = new ArrayList<>();
        for(int i=1;i<=100;++i){
            String t=Fizzbuzz(i);
            fizzbuzz.add(t);
        }
        System.out.println(fizzbuzz);
    }

}
