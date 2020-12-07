package code._4_student_effort;

import java.lang.reflect.Array;

public class ArrayCustomIterator {
    private int index;
    private int lastIndex;
    private Object array;

    public ArrayCustomIterator(Object array) {
        this.array = array;
        this.index = 0;
        this.lastIndex = Array.getLength(array);
    }

    public boolean hasNext() {
        if (index < lastIndex)
            return true;
        else
            return false;
    }

    public int next() {
        if (hasNext())
            return (int) Array.get(array, index++);
        else
            return 0;
    }
}
