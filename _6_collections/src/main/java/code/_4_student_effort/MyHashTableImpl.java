package code._4_student_effort;
public class MyHashTableImpl<K, V> implements MyHashTable<K,V> {
    private int nr = 0;
    private Object[] values = new Object[Integer.MAX_VALUE / 100];

    @Override
    public V get(K key) {
        return (V) this.values[key.hashCode()];
    }

    @Override
    public void put(K key, V value) {
        this.values[key.hashCode()] = value;
        nr++;

    }

    @Override
    public void remove(K key) {
        this.values[key.hashCode()] = null;

    }

    @Override
    public boolean containsKey(Object key) {
        return this.values[key.hashCode()] != null;
    }

    @Override
    public int size() {
        return nr;
    }
}
