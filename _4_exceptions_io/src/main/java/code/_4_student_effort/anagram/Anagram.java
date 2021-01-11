package code._4_student_effort.anagram;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {
    private static final String SMALL_LIST_FILE = "_4_exceptions_io\\_test_files\\in\\small_list.txt";
    private static final String BIG_LIST_FILE = "_4_exceptions_io\\_test_files\\in\\big_list.txt";
    private static final String OUTPUT_FILE = "_4_exceptions_io\\_test_files\\out\\anagram.txt";
    private ArrayList<String> words = new ArrayList<>();
    private ArrayList<String> anagrams = new ArrayList<>();

    void readInput(String path, ArrayList<String> words) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(path)));

            while (scanner.hasNext()) {
                String word = scanner.next();
                words.add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    void writeOutput(String path, ArrayList<String> anagrams) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (String current : anagrams) {
                bufferedWriter.write(current + "\n");
            }

            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public ArrayList<String> getAnagrams() {
        return anagrams;
    }

    public boolean checkIsWord(String word, ArrayList<String> words) {
        for (String current : words) {
            if (current.equals(word)) {
                return true;
            }
        }

        return false;
    }

    public void permute(String word, String anagram, ArrayList<String> words, ArrayList<String> anagrams) {
        if (word.length() == 0) {
            if (checkIsWord(anagram, words)) {
                anagrams.add(anagram);
                System.out.println(anagram);
            }
            return;
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            String temp = word.substring(0, i) + word.substring(i + 1);
            permute(temp, anagram + ch, words, anagrams);
        }
    }

    public static void main(String[] args) {
        Anagram obj = new Anagram();
        obj.readInput(BIG_LIST_FILE, obj.getWords());
        obj.permute("listen", "", obj.getWords(), obj.getAnagrams());
        obj.writeOutput(OUTPUT_FILE, obj.getAnagrams());

/*        for (String test : obj.getAnagrams()) {
            System.out.println(test);
        }*/
    }
}
