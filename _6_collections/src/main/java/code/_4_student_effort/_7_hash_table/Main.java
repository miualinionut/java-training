package code._4_student_effort._7_hash_table;

public class Main {
    public static void main(String[] args) {
        HashTable<String, String> htStr = new HashTable<>();
        htStr.put("Alo", "copii");
        htStr.put("Coco", "roko");
        htStr.put("asxd", "moko");
        System.out.println(htStr.get("Coco"));
        System.out.println(htStr.size());
    }
}
