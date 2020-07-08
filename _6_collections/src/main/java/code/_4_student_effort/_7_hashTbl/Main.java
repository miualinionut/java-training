package code._4_student_effort._7_hashTbl;

public class Main {
    public static void main(String[] args) {
        MyHashTable myHash = new ClassHashTable();

        myHash.put("key1", "val1");
        myHash.put("key2", "val2");

        System.out.println(myHash.size());
    }
}
