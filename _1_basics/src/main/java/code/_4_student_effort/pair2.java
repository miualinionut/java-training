package code._4_student_effort;

import java.util.Arrays;

public class pair2 {

    public static int pairs(int [] numbers){

        int pairs = 0;
        int [] negatives = new int[100];
        int [] positives = new int[100];

        Arrays.fill(negatives,0);
        Arrays.fill(positives,0);


        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] <= 0)
                negatives[(-1) * numbers[i]]++;
            else if(numbers[i] >= 0)
                positives[numbers[i]]++;
        }

        if(negatives[0] % 2 == 0)
            pairs = pairs + negatives[0]/2;

        for (int i = 1; i < negatives.length; i++) {
            pairs = pairs + Math.min(negatives[i], positives[i]);
        }

        return pairs;
    }
}
