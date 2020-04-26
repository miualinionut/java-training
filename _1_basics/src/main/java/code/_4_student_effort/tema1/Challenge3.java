package code._4_student_effort.tema1;

import java.util.Scanner;

public class Challenge3 {

    public static int nrOfPairs(int v[]){
        int taken[] = new int[v.length];
        int result = 0;

        for(int i = 0; i< taken.length; i++)
            taken[i] = 0;

        for(int i = 0; i < v.length; i++){
            for(int j = 0; j < v.length; j++){
                if((v[i] + v[j] == 0) && taken[i] == 0 && taken[j] == 0 && i!=j ) {
                    taken[i] = 1;
                    taken[j] = 1;
                    result ++;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {

        int v1[] = {3,2,-3,-2,3,0};
        int v2[] = {1,1,0,-1,-1};
        int v3[] = {5,9,-5,7,-5};

        System.out.println(nrOfPairs(v1));
        System.out.println(nrOfPairs(v2));
        System.out.println(nrOfPairs(v3));

    }

}
