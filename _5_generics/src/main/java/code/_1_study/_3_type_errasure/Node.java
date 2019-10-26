package code._1_study._3_type_errasure;

public class Node<T> {
    T data;

    //compiler replaces T with Object (type erasure)
    void setData(T data) {
        this.data = data;
    }
}
