package code._2_challenge._8_my_arraylist;

public interface MyArrayList<T> {
  void add(T e);
  void remove(T e);
  T get(int index);
  void set(int index, T e);
  int size();
}
