package code._4_student_effort.Iterator;

public class ArrayCustomIterator {
    int[] in;
    int i;


    ArrayCustomIterator(int[] in)
    {
        this.in=in;
        i=0;
    }



    public boolean hasNext()
    {
        if(this.in.length-1<=i)
        {
            if(this.in.length-1<i)
                return false;
            else
                return true;
        }
        return true;
    }
    public int next()
    {
        i++;
        return this.in[i-1];
    }

    public static void main(String[] args) {
        int[] arr= new int[] {1,2,3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while(it.hasNext())
            System.out.println(it.next());
    }
}
