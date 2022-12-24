package code._4_student_effort.challenge_3;

import java.io.*;
import java.util.ArrayList;

public class Anagram {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        try {
            anagram.printAnagrams("listen", "D:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\out\\outpout.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    boolean isDuplicate(ArrayList<Character> arrayList, int index, char c) {
        for (int i = 0; i < index; i++)
            if (arrayList.get(i) == c)
                return true;
        return false;
    }

    private String getString(ArrayList<Character> arrayList) {
        StringBuilder str = new StringBuilder();
        for (char c: arrayList)
            str.append(c);
        return str.toString();
    }
    private void generateAnagrams(int index, ArrayList<Character> anagram, char[] letters, Writer writer) throws IOException{
        if (index == letters.length) {
            writer.write(getString(anagram) + "\n");
            return;
        }
        for (char letter: letters) {
            if (!isDuplicate(anagram, index, letter)) {
                if (anagram.size() <= index)
                    anagram.add(letter);
                else
                    anagram.set(index, letter);
                generateAnagrams(index + 1, anagram, letters, writer);
            }
        }
    }

    private void printAnagrams(String word, String destination) throws IOException {
        FileWriter writer = new FileWriter(destination);
        ArrayList<Character> arrayList = new ArrayList<Character>();
        StringBuffer s = new StringBuffer();
        generateAnagrams(0, arrayList, word.toCharArray(), writer);
        writer.close();
    }
}
