package code._3_in_class;

public class B<T extends A> {
    T process(T t){
      t.count();
      t.show();
      return t;
    }
}
