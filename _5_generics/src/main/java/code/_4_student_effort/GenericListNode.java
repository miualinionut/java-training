package code._4_student_effort;

public class GenericListNode<T> implements IGenericListNode<T> {
    private T value;
    private IGenericListNode<T> next;

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setNext(IGenericListNode<T> next) {
        this.next = next;
    }

    @Override
    public IGenericListNode<T> getNext() {
        return next;
    }
}
