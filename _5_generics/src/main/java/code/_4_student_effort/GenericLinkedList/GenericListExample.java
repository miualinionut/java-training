package code._4_student_effort.GenericLinkedList;

public class GenericListExample {
    public static void main(String[] args) {
        String rootvalue = "a";
        GenericList<String> list = new GenericList<>(rootvalue);
        for (int i = 0; i<10 ; i++){
            list.insert(String.valueOf(Character.valueOf((char)(rootvalue.charAt(0) +i))));
        }
        list.println();
    }
}
