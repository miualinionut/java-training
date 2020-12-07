package code._4_student_effort.iterator;

public class ArrayCustomIterator implements MyIterator {
    private int[] list;
    private int position;

    public ArrayCustomIterator(int[] list) {
        this.list = list;
        position  = 0;
    }

    @Override
    public boolean hasNext() { return (position < list.length); }

    @Override
    public int next()     { return list[position++]; }
}