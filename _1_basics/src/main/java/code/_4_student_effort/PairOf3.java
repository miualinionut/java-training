package code._4_student_effort;

public class PairOf3 {
    public static int countPairs(int[] numbers){
        int count = 0;
        Integer[] foundPairIndexes = new Integer[numbers.length];
        int numberOfFoundIndexes = 0;
        for (int i = 0; i< numbers.length-2; i++)
            for (int j = i+1; j< numbers.length-1; j++)
                for (int k = j+1; k< numbers.length; k++){
                    if((numbers[i]+numbers[j]+numbers[k] == 0) && notInOtherPair(foundPairIndexes, i, j, k)){
                        foundPairIndexes[numberOfFoundIndexes++] = i;
                        foundPairIndexes[numberOfFoundIndexes++] = j;
                        foundPairIndexes[numberOfFoundIndexes++] = k;
                        count++;
                    }
                }
        return count;
    }

    private static boolean notInOtherPair(Integer[] foundPairIndexes, int a, int b, int c){
        for (int index = 0; index<foundPairIndexes.length; index++){
            if( foundPairIndexes[index] != null ){
                if ((foundPairIndexes[index] == a) || (foundPairIndexes[index] == b) || (foundPairIndexes[index] == c)){
                    return false;
                }
            }
        }
        return true;
    }
}
