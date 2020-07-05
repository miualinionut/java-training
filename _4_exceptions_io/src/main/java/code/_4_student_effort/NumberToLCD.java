package code._4_student_effort;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberToLCD {

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

    public static void main(String[] args) {

    }
}
