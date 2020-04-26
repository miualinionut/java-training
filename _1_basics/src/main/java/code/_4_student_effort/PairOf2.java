package code._4_student_effort;

public class PairOf2 {
    public static void main(String[] args) {
        int[] array = {-1, -1, -1, 2, 4, -2, -2, 1, 0};
        int nrOfPairs = 0;
        int len = array.length;
        for (int i = 0; i < len - 1; i++){
            for(int j = i + 1; j < len; j++){
                if(array[i] + array[j] == 0){
                    nrOfPairs++;
                    for (int k = j; k < len - 1 ; k++)
                        array[k] = array[k+1];
                    for (int k = i; k < len - 1 ; k++)
                        array[k] = array[k+1];
                    len -= 2;
                    j-=2;
                }
            }
        }
        System.out.println(nrOfPairs);
    }
}
