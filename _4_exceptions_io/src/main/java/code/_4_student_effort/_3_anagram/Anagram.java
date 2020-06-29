package code._4_student_effort._3_anagram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Anagram {
    public static void main(String[] args) {
        String s = "listen";
        char[] letters = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            letters[i] = s.charAt(i);
        }
        recursionAnagram(letters,0);

    }

    static void recursionAnagram(char[] letters, int i) {
        if (i == letters.length - 1) System.out.println(letters);
        else {
            for (int j = i; j < letters.length; j++) {
                char temp = letters[i];
                letters[i] = letters[j];
                letters[j] = temp;
                recursionAnagram(letters, i + 1);
                temp = letters[i];
                letters[i] = letters[j];
                letters[j] = temp;
            }
        }
    }
}
