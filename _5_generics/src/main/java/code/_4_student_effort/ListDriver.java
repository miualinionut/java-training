package code._4_student_effort;

public class ListDriver {


    public static void main(String[] args) {
        int i;
        String rootValue = "a";
        GenericList<String> list = new GenericList<>(rootValue);

        for(i = 0; i < 10; i++){
            list.insert(String.valueOf(Character.valueOf((char)(rootValue.charAt(0)+i))));
        }
        list.println();
    }

}
