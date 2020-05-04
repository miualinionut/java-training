package code._4_student_effort._1_iterator;

public class ArrayCustomIterator {
    private int[] array;
    private int index;

    public ArrayCustomIterator(int[] array) {
        this.array = array;
        this.index = 0;
    }

    public boolean hasNext(){
        if(index < array.length)
            return true;
        else
            return false;
    }

    public int next(){
        return array[index++];

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
