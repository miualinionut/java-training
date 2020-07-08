package code._4_student_effort._9_mySet;

public interface MySet<T> {
    void add(T e);
    void remove(T e);
    T get(int index);
    void set(int index, T e);
    int size();
    boolean contains(T e);
}
