package code._2_challenge._9_my_set;

import java.util.Arrays;

public class MySetImpl<T> implements MySet<T> {

  private Object[] list = new Object[0]; //naive implementation

  @Override
  public void add(T e) {
    if (!contains(e)) {
      this.list = Arrays.copyOf(list, list.length + 1);
      this.list[this.list.length - 1] = e;
    }
  }

  @Override
  public void remove(T e) {
    Object[] newList = new Object[0];
    for (Object currentElement : this.list) {
      if (!currentElement.equals(e)) {
        newList = Arrays.copyOf(newList, newList.length + 1);
        newList[newList.length - 1] = currentElement;
      }
    }
    this.list = newList;
  }

  @Override
  public T get(int index) {
    return (T) this.list[index];
  }

  @Override
  public void set(int index, T e) {
    if(!contains(e)) {
      this.list[index] = e;
    }
  }

  @Override
  public int size() {
    return this.list.length;
  }

  @Override
  public boolean contains(T e) {
    boolean result = false;
    for (Object o : this.list) {
      if (o.equals(e)) {
        result = true;
        break;
      }
    }
    return result;
  }

}
