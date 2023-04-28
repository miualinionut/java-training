package code._3_in_class;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int[] ar = new int[]{1, 2, 3};
        int[] v1 = copyArray(ar);
        int[] v2 =copyArray(ar);
        ar[0] = 10;
        v1[0] = 100;
        v2[0] = 1000;


        displayVector("ar", ar);
        displayVector("v1",v1);
        displayVector("v2",v2);

        String s="ABC";
        System.out.println(s);
        s="DEF";
        System.out.println(s);
    }

    private static int[] copyArray(int[]ar)
    {
        int[] copyArray=new int[ar.length];
        for(int i=0;i<copyArray.length;i++)
        {
            copyArray[i]=ar[i];
        }
        return copyArray;
    }
    private static void displayVector(String name, int[] ar) {
        System.out.print(name + " = ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

}