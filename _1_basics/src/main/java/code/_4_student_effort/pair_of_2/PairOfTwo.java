package code._4_student_effort.pair_of_2;

public class PairOfTwo {

    public Integer pairs(Integer[] numbers) {
        Integer[] indexesInPairs = new Integer[numbers.length];
        int pairs = 0;
        int noOfIndexesInPairs = 0;

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                boolean isInOtherPairs = false;
                for(int k = 0; k < noOfIndexesInPairs; k++) {
                    if(indexesInPairs[k] == i || indexesInPairs[k] == j) {
                        isInOtherPairs = true;
                        break;
                    }
                }
                if(!isInOtherPairs && (numbers[i] + numbers[j] == 0)) {
                    indexesInPairs[noOfIndexesInPairs++] = i;
                    indexesInPairs[noOfIndexesInPairs++] = j;
                    pairs++;
                    break;
                }
            }
        }
        return pairs;
    }
}
