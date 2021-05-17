package code._4_student_effort;

import java.util.Scanner;

public class curs1_ch3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nr de valori: ");
        int nr= scanner.nextInt();
        int v[]= new int[nr];
        int cnt=0;
        for(int i=0;i<nr;i++) {
            v[i] = scanner.nextInt();
        }
        int ok=0,aux;

            for(int i=0;i<=nr;i++)
            {
                for(int j=i+1;j<=nr-1;j++)
                    if(v[j]<v[i])
                    {
                        aux=v[i];
                        v[i]=v[j];
                        v[j]=aux;
                    }
            }
        System.out.println("SIR ORD");
        for(int i=0;i<nr;i++)
        {
            System.out.println(v[i]);
        }

        for(int i=0;i<nr;i++)
         {
             if(v[i]<0) {
                 for (int j = nr - 1; j > 0; j--) {
                     if (v[i] + v[j] == 0)
                         cnt++;
                 }
             }
         }
        if(cnt%2==0) {
            System.out.println("exista " + cnt / 2 + " perechi");
        }
        else {
            cnt--;
            System.out.println("exista " + cnt + " perechi");
        }
    }

    }

