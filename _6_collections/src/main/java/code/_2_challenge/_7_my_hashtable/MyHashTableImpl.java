package code._2_challenge._7_my_hashtable;

public class MyHashTableImpl<K, V> implements MyHashTable<K, V> {

  private Object[] values = new Object[Integer.MAX_VALUE / 100]; //naive implementation
  private int nrOfElements = 0;

  @Override
  public V get(K key) {
    return (V) this.values[key.hashCode()];
  }

  @Override
  public void put(K key, V value) {
    this.values[key.hashCode()] = value;
    nrOfElements++;
  }

  @Override
  public void remove(K key) {
    this.values[key.hashCode()] = null;
  }

  @Override
  public boolean containsKey(K key) {
    return this.values[key.hashCode()] != null;
  }

  @Override
  public int size() {
    return nrOfElements;
  }
}
