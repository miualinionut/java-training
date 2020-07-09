package code._4_student_effort.Challenge7;

public class Test {
    public static void main(String[] args) {

        // STAGE 1 Requirements
        MyHashTable hashTable1 = new MyHashTableImpl();
        hashTable1.put("key1", "value1");
        hashTable1.put("key2", "value2");
        hashTable1.put("key3", "value3");
        hashTable1.put("key3", "value1");

        System.out.println(hashTable1.size());
        System.out.println(hashTable1.constainsKey("key3"));
        System.out.println(hashTable1.get("key3"));

        // STAGE 2 Requirements
        MyGenericHashTable<Integer, String> hashTable2 = new MyGenericHashTableImpl();
        hashTable2.put(1,"unu");
        hashTable2.put(2,"doi");
        hashTable2.put(3,"trei");

        System.out.println("---------");
        System.out.println(hashTable2.size());
        System.out.println(hashTable2.constainsKey(4));
        hashTable2.remove(5);
        hashTable2.remove(3);
        System.out.println(hashTable2.size());
    }
}
