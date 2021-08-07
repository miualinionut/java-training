package code._4_student_effort;

public class GenericNode<T> implements IGenericNode<T> {
    private T value;
    private IGenericNode<T> next;

    @Override
    public T getValue() {
        return this.value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public IGenericNode<T> getNext() {
        return this.next;
    }

    @Override
    public void setNext(IGenericNode<T> next) {
        this.next = next;
    }
}
