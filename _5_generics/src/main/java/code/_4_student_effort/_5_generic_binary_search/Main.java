package code._4_student_effort._5_generic_binary_search;

public class Main {
    public static void main(String[] args) {
        Integer[] arrAsc = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        GenericBinSearch<Integer> searchInteger = new GenericBinSearch<>(arrAsc);
        int pos = searchInteger.search(2);
        System.out.println("Asc: " + pos);

        Integer[] arrDesc = new Integer[]{10, 9, 8, 7, 6, 5, 4};
        searchInteger.setNewArray(arrDesc);
        pos = searchInteger.search(2);
        System.out.println("Desc: " + pos);

        String[] arrStr = new String[]{"Analfabet", "Azur", "Bolnav", "Copil", "Handicap", "Key", "Locomotiva", "Piersica", "Recoil", "Zeama"};
        GenericBinSearch<String> searchStr = new GenericBinSearch<>(arrStr);
        pos = searchStr.search("Azur");
        System.out.println("Str: " + pos);
    }
}
