package code._4_student_effort;

import java.util.Scanner;

public class PairOf2 {
    public static boolean isFound(int []a, int index, int n){
        for(int i=0; i<n; i++){
            if(a[i]==index){
                return true;
            }
        }
        return false;
    }
    public static int findPairs(int[] v, int n){
        int pairs = 0;
        int []apearences = new int[n];
        outer: for(int i=0; i<n-1; i++){
            if(isFound(apearences, i, pairs)==true)
                continue;
            for(int j=i+1; j<n; j++){
                if(isFound(apearences, j, pairs)==true)
                    continue;
                if(v[i]+v[j]==0){
                    apearences[pairs] = j;
                    pairs++;
                    continue outer;
                }
            }
        }
        return pairs;
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Cate elemente vreti sa contina vectorul?: ");
        Scanner info = new Scanner(System.in);
        n = info.nextInt();
        int vector[] = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("Adaugati elemntul " + i + ": ");
            vector[i] = info.nextInt();
        }
        System.out.println("In vector sunt "+ findPairs(vector, n) + " perechi!");
    }
}
