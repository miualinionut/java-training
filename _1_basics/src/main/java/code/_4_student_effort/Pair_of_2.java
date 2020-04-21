package code._4_student_effort;
import java.util.Arrays;

public class Pair_of_2 {

public static int[] elimina(int[] vect, int index)
{
int nr=vect.length;
int[] vect2=new int[vect.length-1];
for(int i=0, j=0;i<nr;i++)
{
    if(i==index)
        continue;
    vect2[j++]=vect[i];
}
return vect2;
}


    public static void main(String[] args)
    {
        int contor=0;
        int[] vect={-1,-1,-1,2,4,-2,-2,1,0};
        int nr = vect.length;
        for(int i=0;i<nr;i++)
            for(int j=0;j<nr;j++)
            {
                if(j==i)
                    continue;
                if (vect[i] + vect[j] == 0) {
                    vect = elimina(vect, i);
                    if (j == 0 || i > j)
                        vect = elimina(vect, j);
                    else if (i < j)
                        vect = elimina(vect, j - 1);

                    contor++;
                    nr -= 2;
                    i=0;
                    j=0;
                }
            }
        System.out.println(contor);
    }
}
