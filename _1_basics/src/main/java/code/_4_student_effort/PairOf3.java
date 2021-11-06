package code._4_student_effort;

import java.util.Scanner;

public class PairOf3 {
    public static boolean isFound(int[] a, int i, int n){
        for(int x=0; x<n; x++){
            if(a[x]==i) {
                return true;
            }
        }
        return false;
    }
    public static int findPairs(int v[], int n){
        int apearences[] = new int[n];
        int index = 0;
        int pairs = 0;
        outer: for(int i=0; i<n-2; i++){
            if(isFound(apearences, i, index)==true)
                continue;
            for(int j=i+1; j<n-1; j++){
                if(isFound(apearences, j, index)==true)
                    continue;
                for(int k=i+2; k<n; k++){
                    if(isFound(apearences, k, index)==true)
                        continue;
                    if(v[i]+v[j]+v[k]==0){
                        apearences[index]=j;
                        apearences[index+1]=k;
                        index = index+2;
                        pairs++;
                        continue outer;
                    }
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
        System.out.println("In vector sunt "+ PairOf3.findPairs(vector, n) + " perechi!");
    }
}
