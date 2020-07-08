package code._4_student_effort._7_hashTbl;

public class ClassHashTable<K, V> implements MyHashTable<K,V> {
    private Object[] values = new Object[Integer.MAX_VALUE / 100];
    private int nrOfElements = 0;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

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
