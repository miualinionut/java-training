package code._2_challenge._7_my_hashtable;

public interface MyHashTable<K, V> {

  V get(K key);

  void put(K key, V value);

  void remove(K key);

  boolean containsKey(K key);

  int size();

}
