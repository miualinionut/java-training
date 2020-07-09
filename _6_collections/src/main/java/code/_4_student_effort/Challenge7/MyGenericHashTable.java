package code._4_student_effort.Challenge7;

public interface MyGenericHashTable <K,V> {
    V get (K key);
    void put(K key, V value);
    void remove(K key);
    boolean constainsKey(K key);
    int size();
}
