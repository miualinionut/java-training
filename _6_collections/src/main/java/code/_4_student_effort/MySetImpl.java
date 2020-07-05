package code._4_student_effort;

import java.util.Collection;
import java.util.List;

public class MySetImpl<T> implements MySet<T> {

    private Object[] arr;
    private int size;
    private int current;

    public MySetImpl() {
        this.arr = new Object[1];
        size = 1;
        current = 0;
    }

    private Object[] resize(Object[] arr, int newSize) {

        Object[] newArrayResized = new Object[newSize];
        System.arraycopy(arr, 0, newArrayResized, 0, arr.length - 1);

        return newArrayResized;
    }

    @Override
    public void add(T e) {
        if (this.contains(e))
            return;

        if (!(size > arr.length + 1)) {
            size *= 2;
            arr = resize(this.arr, size);
        }
        arr[current] = e;
        current++;
    }

    @Override
    public void remove(T e) {
        Object[] arrCopy = new Object[size];
        int numberOfDeletions = 0;
        for (int i = 0; i < current; i++) {
            if (!arr[i].equals(e)) {
                arrCopy[i] = arr[i];
            } else {
                numberOfDeletions++;
            }
        }
        current -= numberOfDeletions;
        arr = arrCopy;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > arr.length) {
            throw new IndexOutOfBoundsException();
        }
        return (T) arr[index];
    }

    @Override
    public void set(int index, T e) {
        if (index < 0 || index > arr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (contains(e))
            return;

        arr[index] = e;
    }

    @Override
    public int size() {
        return current;
    }

    @Override
    public boolean contains(T e) {
        for (int i = 0; i < current; i++) {
            if (arr[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Collection<Integer> withDups = List.of(1, 1, 2, 1, 3, 2);

        MySet<Integer> mySet = new MySetImpl<>();
        for (Integer i : withDups) {
            mySet.add(i);
        }

        for (int i = 0; i < mySet.size(); i++) {
            System.out.println(mySet.get(i));
        }
    }
}
