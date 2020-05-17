package code._4_student_effort.Challenge3;

public interface IGenericNode<T> {
    T getValue();

    void setValue(T value);

   IGenericNode<T> getNext();

    void setNext(IGenericNode<T> next);
}