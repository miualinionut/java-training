package code._4_student_effort;

//import java.util.Arrays;
import java.util.Scanner;

public class PairOf3 {
    public static void main(String[] args){
        int pair=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Citeste numarul de elemente ale lui v.");
        int n=s.nextInt();
        int v[]=new int[n+1];
        int f[]=new int[n+1];
        for(int i=0;i<n;i++)
            f[i]=0;
        System.out.println("Citeste elementele vectorului.");
        for(int i=0;i<n;i++)
            v[i]=s.nextInt();
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++) {
                    if (f[i] == 0 && f[j] == 0 && f[k] == 0) {
                        if (v[i] + v[j] + v[k] == 0) {
                            pair++;
                            f[i] = 1;
                            f[j] = 1;
                            f[k] = 1;
                        }
                    }
                }
            }

        System.out.println("Numarul de perechi este: " + pair);

    }
}
