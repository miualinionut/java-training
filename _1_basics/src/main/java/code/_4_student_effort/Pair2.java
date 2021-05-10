package code._4_student_effort;

import java.util.Collections;
import java.util.Vector;

public class Pair2
{
    public static void main(String[] args)
    {
        Vector<Integer> list = new Vector<>();
        list.add(3);
        list.add(2);
        list.add(-3);
        list.add(-2);
        list.add(3);
        list.add(0);
        Collections.sort(list);

        int nr = 0, min = list.size()-2;
        for (int i = 0; i <= min; i++)
        {
            for (int j = list.size()-1; j > i; j--)
                if (list.get(j) == -list.get(i))
                {
                    nr++;
                    list.remove(j);
                    list.remove(i);
                    min = min-2;
                    j--;
                }
        }
        System.out.println(nr);
    }
}
