package code._4_student_effort;

public class PairOf3 {
    public static void main(String[] args) {
        int[] array = {-1, -1, -1, 2};
        int nrOfPairs = 0;
        int len = array.length;
        for (int i = 0; i < len - 2; i++){
            for (int j = i + 1; j < len-1; j++){
                for (int k = j + 1; k < len; k++)
                    if(array[i] + array[j] + array[k] == 0){
                        nrOfPairs++;
                        for (int x = k; x < len - 1 ; x++)
                            array[x] = array[x+1];
                        for (int x = j; x < len - 1 ; x++)
                            array[x] = array[x+1];
                        for (int x = i; x < len - 1 ; x++)
                            array[x] = array[x+1];
                        len -= 3;
                        k -= 2;
                }
            }
        }
        System.out.println(nrOfPairs);
    }
}
