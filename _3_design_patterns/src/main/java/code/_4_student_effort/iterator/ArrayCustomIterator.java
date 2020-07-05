package code._4_student_effort.iterator;

public class ArrayCustomIterator {
    private int arr[];
    private int contor;
   public ArrayCustomIterator(int arr[])
    {
        this.arr=arr;
        this.contor=0;
    }
   public boolean hasNext(){ return this.contor<this.arr.length;
   }
    int next(){return this.arr[this.contor++]; }




    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
