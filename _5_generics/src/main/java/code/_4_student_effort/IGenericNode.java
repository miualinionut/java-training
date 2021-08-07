package code._4_student_effort;

public interface IGenericNode<T> {
    T getValue();

    void setValue(T value);

    IGenericNode<T> getNext();

    void setNext(IGenericNode<T> next);
}
