public class ArrayCustomIterator implements MyIterator{
    private int array[];
    int position;

    public ArrayCustomIterator(int[] arr) {
        this.array=arr;
    }

    public boolean hasNext(){ return (position < array.length);}
    public Integer next(){ return array[position++];}
}