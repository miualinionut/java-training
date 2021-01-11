package code._4_student_effort.myArrayList;

import java.util.Arrays;

public class MyArrayListImpl<T> implements MyArrayList<T> {
    private Object[] elements = new Object[10];
    private int size = 0;

    @Override
    public void add(T t) {
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size] = t;
        size++;

    }

    @Override
    public void remove(T e) {
        Object[] newList = new Object[size];
        boolean isRemoved = false;
        int i, j = 0;
        for (i = 0; i < size; i++) {
            if (elements[i] != e) {
                newList[j] = elements[i];
                j++;
            } else {
                isRemoved = true;
            }
        }
        if (isRemoved) {
            size--;
        }
        this.elements = Arrays.copyOf(newList, elements.length);
    }

    @Override
    public T get(int index) {
        if (index < size) {
            return (T) elements[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public void set(int index, T e) {
        if (index < size) {
            elements[index] = e;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += elements[i] + " ";
        }
        return result;
    }
}
