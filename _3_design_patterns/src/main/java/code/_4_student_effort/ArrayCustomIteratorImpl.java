package code._4_student_effort;

public class ArrayCustomIteratorImpl implements ArrayCustomIterator {
    private int[] array;
    private int position;
    
    public ArrayCustomIteratorImpl(int array[]){
        this.array = array;
        this.position = position;
    }

    @Override
    public boolean hasNext() {
        return (position < array.length);
    }

    @Override
    public int next() {
        return array[position++];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIteratorImpl(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
