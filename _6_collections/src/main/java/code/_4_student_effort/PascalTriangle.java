package code._4_student_effort;

public class PascalTriangle {

    public static void printPascal(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++)
                System.out.print(binomialCoef(i,j) + " ");
            System.out.println();
        }
    }

    public static int binomialCoef(int n, int k){
        int rez = 1;
        if(k > n - k)
            k = n - k;
        for(int i = 0; i < k; ++i){
            rez = rez * (n-1);
            rez = rez / (i+1);
        }
        return rez;
    }

    public static void main (String args[]){
        int n = 8;
        printPascal(n);
    }
}
