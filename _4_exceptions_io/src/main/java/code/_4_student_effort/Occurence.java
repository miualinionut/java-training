package code._4_student_effort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Occurence {


    public static void main(String[] args){

        try {
            WordOccurrence[] uniqueList = uniqueWordsPopulator(readFile());
            for (WordOccurrence word:uniqueList)
                System.out.println(word.getWord());
        }
        catch (FileNotFoundException e){
            System.out.println("exception");
        }

    }

    private static String[] readFile()throws FileNotFoundException {
        String[] words = new String[0];
        try (Scanner s = new Scanner(new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\a.txt")))) {
            s.useLocale(Locale.US);
            while (s.hasNext()) {
                words = Arrays.copyOf(words, words.length + 1);
                words[words.length - 1] = s.next();
            }
        }
        return words;
    }

    private static WordOccurrence[] uniqueWordsPopulator(String[] words){
        WordOccurrence[] uniqueWords = new WordOccurrence[0];
        boolean ok = true;
        for(String word:words){
            for(WordOccurrence uniqueWord:uniqueWords){
                if(uniqueWord.equals(word)){
                    ok=false;
                }
            }
            if(ok==true){
                uniqueWords = Arrays.copyOf(uniqueWords, uniqueWords.length + 1);
                uniqueWords[uniqueWords.length - 1] = new WordOccurrence(word);
            }
            ok=true;
        }
        return uniqueWords;
    }
}
