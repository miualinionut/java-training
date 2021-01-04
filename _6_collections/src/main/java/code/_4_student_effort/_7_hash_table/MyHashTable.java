package code._4_student_effort._7_hash_table;

public interface MyHashTable<K, V> {
    V get(K key);
    void put(K key, V value);
    void remove(K key);
    boolean containsKey(K key);
    int size();
}
