import java.util.Vector;

public class Pair {

    public static void main ( String args[])
    {
        int n=6,k=0 ;
        Vector<Integer> v = new Vector<Integer>(n);
       // Vector<Integer> w = new Vector<Integer>();
        v.add(3);
        v.add(-2);
        v.add(2);
        v.add(-3);
        v.add(1);
        v.add(-1);

        int ok =0, suma =0;

        for (int i = 0; i < v.size()-1; i++)
            for (int j = i+1; j < v.size(); j++) {

                suma = v.get(i) + v.get(j);

                if (suma == 0) {
                    ok++;

                    //w.add(i);
                    //w.add(j);
                }
            }

        System.out.print(ok);
    }
}
