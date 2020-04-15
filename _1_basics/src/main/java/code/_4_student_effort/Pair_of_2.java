package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Pair_of_2 {
    public static void main(String[] args) {
        System.out.println(numberOfPairs(new int[]{3, 2, -3, -2, 0}));
        System.out.println(numberOfPairs(new int[]{3, 2, -3, -2, 0, 0}));
        System.out.println(numberOfPairs(new int[]{1, 1, 0, -1, -1}));
        System.out.println(numberOfPairs(new int[]{5, 9, -5, 7, -5}));
    }

    private static int numberOfPairs(int[] numbers) {
        int numberOfPairs = 0;
        // Lista care va contine indexi numerelor ce formeaza perechi
        List<Integer> indexOfPairsFound = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            if (indexOfPairsFound.contains(i))
                continue;

            for (int j = i + 1; j < numbers.length; j++) {
                if (indexOfPairsFound.contains(j))
                    continue;

                if (numbers[i] + numbers[j] == 0) {
                    // Am gasit pereche, deci incrementam counterul
                    numberOfPairs++;
                    // Adaug indexi care pot fi sariti
                    indexOfPairsFound.add(i);
                    indexOfPairsFound.add(j);
                    break;
                }

            }
        }
        return numberOfPairs;
    }

}
