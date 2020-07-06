package code._4_student_effort._3_linkedList;

public interface IGenericNode<T> {
    T getValue();
    void setValue(T value);
    IGenericNode<T> getNext();
    void setNext(IGenericNode<T> next);
}
