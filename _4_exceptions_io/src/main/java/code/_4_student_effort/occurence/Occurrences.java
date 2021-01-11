package code._4_student_effort.occurence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Occurrences {

    static final String PATH = "_4_exceptions_io\\_test_files\\in\\a.txt";
    ArrayList<Word> words = new ArrayList<>();

    public ArrayList<Word> getWords() {
        return words;
    }

    public void countOccurrences(ArrayList<Word> words, String word) {
        boolean find = false;
        for (Word current : words) {
            if (current.getWord().equals(word)) {
                current.addOccurrence();
                find = true;
            }
        }
        if (!find) {
            words.add(new Word(word));
        }
    }

    public void readInput(String path, ArrayList<Word> words) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(path)));
            scanner.useDelimiter(" |!|,|\\.|\\n");

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word != null && word.length() != 0 && !word.equals("'")) {
                    countOccurrences(words, word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public static void main(String[] args) {
        Occurrences obj = new Occurrences();
        obj.readInput(PATH, obj.getWords());

        Collections.sort(obj.getWords());
        for (int i = 0; i < 10; i++) {
            System.out.println(obj.getWords().get(i));
        }
    }

}
