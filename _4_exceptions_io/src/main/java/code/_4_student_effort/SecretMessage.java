package code._4_student_effort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecretMessage {

    private static List<String> read (String filename) {
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

    private static StringBuilder findUpperCase(String word) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                s.append(word.charAt(i));
            }
        }
        return s;
    }



    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        String filename = "/_test_files/in/message.txt";
        StringBuilder secretMessage = new StringBuilder();

        words = read(filename);

        for (String word : words) {
            secretMessage.append(findUpperCase(word));
        }

        System.out.println(secretMessage);
    }
}
