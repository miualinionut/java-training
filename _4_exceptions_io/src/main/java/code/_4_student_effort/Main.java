package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    static int MAX_NUMBER = 1000;

    public static void main(String[] args) throws FileNotFoundException {

        try {
            String wordsInMessage = "_4_exceptions_io\\_test_files\\in\\message.txt";
            System.out.println(discoverMessage(readFile(wordsInMessage)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String discoverMessage(String[] wordsInMessage){
        StringBuilder secretMessage = new StringBuilder(" ");

        for(int i = 0; i< wordsInMessage.length;i++){
            String word = wordsInMessage[i];
            char[] letters = word.toCharArray();
            for(char letter:letters){
                if(Character.isUpperCase(letter)){
                    if(letter == 'X') {
                        secretMessage.append(" ");
                    }
                    else{
                        secretMessage.append(letter);
                    }
                }
            }
        }
        return secretMessage.toString();
    }
    private static String[] readFile(String fileName) throws FileNotFoundException {
            Scanner s = null;
            String[] words = new String[MAX_NUMBER];
            int wordCount = 0;
        try {

            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            while(s.hasNext() && wordCount < MAX_NUMBER){
                words[wordCount++] = s.next();
            }
        } finally {
                if (s != null) s.close();
        }
        String[] appropriateLengthWordsArray = new String[wordCount];
        System.arraycopy(words, 0, appropriateLengthWordsArray, 0, wordCount);
        return appropriateLengthWordsArray;
    }
}
