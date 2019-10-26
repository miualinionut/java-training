package code._2_challenge._3_generic_linked_list;

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
