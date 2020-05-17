package code._4_student_effort.code_challenge_3_Generic_Linked_List;

public class GenericListMain {
    public static void main(String[] args) {
        String rootValue = "a";
        GenericList<String> list = new GenericList<>(rootValue);

        for (int i = 1; i < 10; i++) {
            list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
        }
        list.println();
    }
}
