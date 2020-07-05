package code._4_student_effort;

public class MyArrayListImpl<T> implements MyArrayList<T> {

    private Object[] arr;
    private int size;
    private int current;

    public MyArrayListImpl() {
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
        arr[index] = e;
    }

    @Override
    public int size() {
        return current;
    }

    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayListImpl<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }

        arr.remove(9);
        arr.set(0, 99);

        for (int i = 30; i < 40; i++) {
            arr.add(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }
}
