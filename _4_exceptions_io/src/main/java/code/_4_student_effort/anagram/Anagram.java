package code._4_student_effort.anagram;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
    private List<String> list= new ArrayList<>();
    private int cnt = 0;

    public Anagram(String word) {
        generateAnagram(word, "");
    }

    private void generateAnagram(String word, String output) {
        if (word.length() == 0) {
            list.add(output);
            return;
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            String ros = word.substring(0, i) + word.substring(i + 1);

            generateAnagram(ros, output + c);
        }
    }

    public List<String> getList() { return list; }
}
