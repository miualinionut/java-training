package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Occurence {
    public static void main(String[] args) {
        String inputFileName = "_4_exceptions_io\\_test_files\\in\\a.txt";
        ArrayList<Word> words = countOccurrences(inputFileName);
        displayTopTen(words);
    }

    private static ArrayList<Word> countOccurrences(String fileName){
       ArrayList<Word> wordOccurrence = new ArrayList<>();
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(fileName)))){
            while (s.hasNext()){
                String foundWord = s.next();
                boolean newWord = true;
                for (Word word : wordOccurrence){
                    if(word.word.equals(foundWord)){
                        word.occurrence ++;
                        newWord = false;
                        break;
                    }
                }
                if(newWord){
                wordOccurrence.add(new Word(foundWord));}
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return wordOccurrence;
    }

    public static void displayTopTen(ArrayList<Word> words){
        Collections.sort(words, Collections.reverseOrder());
        for(int i=0;i<10;i++){
            System.out.println(words.get(i).word+":"+words.get(i).occurrence);
        }
    }
}
