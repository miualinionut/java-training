package code._4_student_effort.occurrence;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<Word> words = new ArrayList<>();

    public Main() throws IOException {
        File input_file = new File("input.txt");
        Scanner scanner = new Scanner(input_file);

        while(scanner.hasNext()) {
            String word = scanner.next();
            boolean check = true;

            for(int i = 0; i < words.size(); i++)
                if(word.equals(words.get(i).getWord())) {
                    words.get(i).updateCounter();
                    check = false;
                }

            // pass punctuation signs
            switch (word) {
                case "?":
                case "!":
                case "-":
                case ".":
                case ",":
                    check = false;
                    break;
                default:
                    check = true;
            }

            if(check)
                words.add(new Word(word, 1));

        }

        // sort the arraylist with respect to the counter
        words.sort(Comparator.comparing(Word::getCounter).reversed());
        for(int i = 0; i < words.size(); i++)
           System.out.println(words.get(i).getWord() + ": " + words.get(i).getCounter());

    }

    public static void main(String[] args) {
        try {
            new Main();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
