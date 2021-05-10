package code._4_student_effort;

import java.util.Collections;
import java.util.Vector;

public class Pair3
{
    public static void main(String[] args)
    {
        Vector<Integer> list = new Vector<>();
        list.add(-1);
        list.add(-1);
        list.add(-1);
        list.add(2);
        Collections.sort(list);

        int nr = 0;
        for (int i = 0; i <= list.size()-3; i++)
            for (int j = i+1; j <= list.size()-2; j++)
                for (int k = j+1; k <= list.size()-1; k++)
                {
                    if (list.get(i) + list.get(j) + list.get(k) == 0)
                    {
                        nr++;
                        list.remove(k);
                        list.remove(j);
                        list.remove(i);
                    }
                }
        System.out.println(nr);
    }
}
