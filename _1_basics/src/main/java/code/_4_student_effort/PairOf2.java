package code._4_student_effort;

import java.util.Arrays;

public class PairOf2 {

    public static void main(String[] args) {

        int n = 6;
        int []x = new int[]{3, 2, -3, -2, 3, 0};

        int []f = new int[n];
        Arrays.sort(x);
        int aux = 10000; int k= -1;
        for(int i = 0;i <n ;i++){
            if(aux != x[i]){
                aux = x[i];
                f[++k]++;
            } else {
                f[k]++;
            }
        }
        int count =0;
        for(int i = 0;i<n;i++) {
            if (f[i] % 2 == 0 && f[i] != 0) {
                count++;
            } else {
                count += f[i] / 2;
            }
        }
        System.out.println(count);
    }
}
