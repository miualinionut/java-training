package code._4_student_effort._3_linkedList;

public class Main {
    public static void main(String[] args) {
        String root = "a";
        GenericList<String> list = new GenericList<>(root);
        for(int i = 1; i < 10 ; i++){
            list.insert(String.valueOf(Character.valueOf((char)(root.charAt(0) + i))));
        }
        list.println();
    }
}
