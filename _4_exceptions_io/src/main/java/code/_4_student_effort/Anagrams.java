package code._4_student_effort;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagrams {

    private static List<String> read(String filename) {
        List<String> words = new ArrayList<>();
        String filepath = new File("").getAbsolutePath();
        try (Scanner s = new Scanner(new BufferedReader(new FileReader(filepath + filename)))) {
            while (s.hasNext()) {
                words.add(s.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return words;
    }

    private static void write(List<String> words, String filename) {
        String filepath = new File("").getAbsolutePath();

        try {
            FileWriter fd = new FileWriter(filepath + filename);
            BufferedWriter bufferedWriter = new BufferedWriter(fd);

            for (String word : words) {
                bufferedWriter.write(word + "\n");
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String swap(String word, int left, int right) {
        char[] charArray = word.toCharArray();
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
        return String.valueOf(charArray);
    }

    private static List<String> allAnagrams(String word, List<String> anagrams,
                                            int left, int right) {
        if (left == right) {
            anagrams.add(word);
        } else {
            for (int i = left; i < right; i++) {
                word = swap(word, left, i);
                allAnagrams(word, anagrams, left + 1, right);
                word = swap(word, left, i);
            }
        }
        return anagrams;
    }


    public static void main(String[] args) {
        String outputFile = "/_test_files/out/anagram.txt";
        String smallList = "/_test_files/in/small_list.txt";
        String bigList = "/_test_files/in/big_list.txt";

        List<String> allWords = new ArrayList<>(read(smallList));
        allWords.addAll(read(bigList));

        for (String word : allWords) {
            List<String> an = new ArrayList<>();
            List<String> anagrams = allAnagrams(word, an, 0, word.length());

            write(anagrams, outputFile);
        }

        List<String> anagrams = new ArrayList<>();
        List<String> aaa = allAnagrams("listen", anagrams, 0, 6);

        write(aaa, outputFile);


    }
}
