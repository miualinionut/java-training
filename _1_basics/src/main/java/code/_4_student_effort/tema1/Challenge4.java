package code._4_student_effort.tema1;
import java.util.Arrays;

public class Challenge4 {

    public static int nrOfPairs(int v[]){

        int nrPairs=0;
        int taken[] = new int[v.length];
        for(int i = 0; i < taken.length; i++)
            taken[i] = 0;

        Arrays.sort(v);

        for(int i = 0; i < v.length-2; i++){
            int left = i+1;
            int right = v.length - 1;

            while(right-left > 1){

                if((v[i] + v[left] + v[right]) == 0 && taken[i] == 0 && taken[left] == 0 && taken[right] == 0){
                    nrPairs++;
                    taken[i] = 1;
                    taken[left] = 1;
                    taken[right] = 1;
                    break;
                }
                else if( v[i] + v[left] + v[right] < 0 ) {
                    left++;
                }

                else if( v[i] + v[left] + v[right] > 0 ) {
                    right--;
                }

            }
        }

        return nrPairs;
    }

    public static void main(String[] args) {

        int v[] = {-1,9,-1,2};
        System.out.println(nrOfPairs(v));

        int v2[] = {4,7,-1,2,7,-1,-7,0};
        System.out.println(nrOfPairs(v2));

        int v3[] = {-1,-1,-1,2};
        System.out.println(nrOfPairs(v3));

    }
}
