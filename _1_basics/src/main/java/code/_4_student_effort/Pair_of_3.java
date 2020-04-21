package code._4_student_effort;

public class Pair_of_3
{

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
              for(int k=0;k<nr;k++)
            {
                if(j==i||j==k||i==k)
                    continue;
                if (vect[i] + vect[j]+vect[k] == 0) {
                    vect = elimina(vect, i);
                    if (j == 0 || i > j)
                        vect = elimina(vect, j);
                    else if (i < j)
                        vect = elimina(vect, j - 1);
                    if (k == 0 || i > k&&j>k)
                        vect = elimina(vect, j);
                    else if (i < k&&j>k)
                        vect = elimina(vect, k - 1);
                    else if(i<k&&j<k)
                        vect = elimina(vect, k - 2);

                    contor++;
                    nr -= 3;
                    i=0;
                    j=0;
                    k=0;
                }
            }
        System.out.println(contor);
    }
}
