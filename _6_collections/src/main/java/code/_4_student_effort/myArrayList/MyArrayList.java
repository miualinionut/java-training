package code._4_student_effort.myArrayList;

public interface MyArrayList <T> {
    void add(T t);
    void remove(T e);
    T get(int index);
    void set(int index, T e);
    int size();
}
