package code._4_student_effort;

public class GenericLinkedListTest {
    public static void main(String[] args) {

        String rootValue = "a";
        GenericLinkedList<String> list = new GenericLinkedList<>(rootValue);

        for (int i = 0; i < 10; i++) {
            list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
        }
        list.println();
    }
}
