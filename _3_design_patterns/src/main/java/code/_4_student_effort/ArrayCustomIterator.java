package code._4_student_effort;

public class ArrayCustomIterator {

    public int[] arr;
    public int index;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
        this.index = 0;
    }

    public boolean hasNext(){
        if (this.index < this.arr.length)
                return true;
        else return false;
    }

    public int next(){
        return this.arr[index++];
    }

    public static void main (String args[]){
        int[] arr = new int[] {1,2,3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
