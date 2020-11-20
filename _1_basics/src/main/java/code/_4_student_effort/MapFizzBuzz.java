/*
package code._4_student_effort;

import java.util.HashMap;
import java.util.Map;

public class MapFizzBuzz {
    public static void main(String[] args) {
        Map<Integer, String> FizzBuzz = new HashMap<Integer, String>();
        FizzBuzz.put(3, "Fizz");
        FizzBuzz.put(5, "Buzz");
        FizzBuzz.put(7, "Rizz");
        FizzBuzz.put(11, "Jazz");

        int result[] = new int[];
        int n = 100;

        for (int i = 1; i <= n; i++) {
            String str = " ";
           for(Map.Entry<String, String> entry : FizzBuzz.entrySet()){
               if(i % Integer.parseInt(entry, 10) == 0){
                   str += FizzBuzz[entry];
               }
           }
           if(str.length() == 0){
               str += i;
           }
           result.get(str);
        }
        return result;
    }
}
*/