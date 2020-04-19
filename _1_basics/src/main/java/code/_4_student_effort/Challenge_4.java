package code._4_student_effort;

import java.util.Scanner;
import java.util.Arrays;

public class Challenge_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Lungimea sirului este:");
        int n = scan.nextInt();
        int sir[] = new int[n];
        System.out.print("Sirul este:");

        for(int i=0; i<n; i++ ) {
            sir[i] = scan.nextInt();
        }
        int x=pair(n,sir);
        System.out.print(x);
        scan.close();
    }

    public static int  pair(int n, int []sir){
        int i,j,m,cnt=0,k=0,l,ok;
        int v[] = new int[1000];   // vector care contine pozitiile numerelor din fiecare pereche
        for(i=0;i<n-2;i++)
            for(j=i+1;j<n-1;j++)
                for(m=j+1;m<n;m++)
                    if(sir[i]+sir[j]+sir[m]==0){
                        ok=1;
                        for(l=0;l<k;l++) //daca nu gaseste pozitiile i, j si m in vectorul v inseamna ca am gasit alta pereche
                            if(v[l]==j||v[l]==i||v[l]==m)
                                ok=0;
                        if(ok==1) {
                            cnt++;
                            v[k++]=j;
                            v[k++]=i;
                            v[k++]=m;
                    }
                }
        return cnt;
    }




}