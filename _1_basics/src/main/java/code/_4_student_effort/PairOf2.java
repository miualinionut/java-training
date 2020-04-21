package code._4_student_effort;

//import java.util.Arrays;
import java.util.Scanner;
public class PairOf2 {
    public static void main(String[] args){
        int pair=0,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Citeste numarul de elemente ale lui v.");
        int n=s.nextInt();
        int v[]=new int[n+1];
        int f[]=new int[n+1];
        for(int i=0;i<n;i++)
            f[i]=0;
        //v[0]=s.nextInt();
        System.out.println("Citeste elementele vectorului.");
        for(int i=0;i<n;i++)
            v[i]=s.nextInt();
        int y,x;
            for(int i=0;i<n;i++)
            {for( j=i+1;j<n;j++)
                if(f[i]==0 && f[j]==0){
                    if(v[i]+v[j]==0){
                        pair++;
                        f[i]=1;
                        f[j]=1;
                    }
                }
            }

    System.out.println("Numarul de perechi este: " + pair);

    }
}
