package code._4_student_effort._3_generic_linked_list;

public class Main {
    public static void main(String[] args) {
        String rootValue = "A";
        GenericList<String> list = new GenericList<>(rootValue);
        for(int i = 1; i < 10; i++){
            list.insert(String.valueOf(Character.valueOf((char)(rootValue.charAt(0)+i))));
        }
        list.println();
    }
}
