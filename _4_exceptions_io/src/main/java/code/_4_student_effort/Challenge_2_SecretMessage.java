package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Challenge_2_SecretMessage {
    private static final String FILE = "_4_exceptions_io\\_test_files\\in\\message.txt";

    public static void main(String[] args){
        try{
            System.out.println(getSecretMessage(readFile(FILE)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String getSecretMessage(String[] words) {
        String secretMessage = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char[] letters = word.toCharArray();
            for (char letter : letters) {
                if (Character.isUpperCase(letter)) {
                    if (letter == 'X') {
                        secretMessage += " ";
                    } else {
                        secretMessage += letter;
                    }
                }
            }
        }
        return secretMessage;
    }

    private static String[] readFile(String filename) throws FileNotFoundException {
        String[] words = new String[0];
        int count=0;
        Scanner s=null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(filename)));
            s.useLocale(Locale.US);
            while (s.hasNext()) {
                words = Arrays.copyOf(words, words.length + 1);
                words[count++] = s.next();
            }
        } finally {
            if(s!=null) s.close();
        }
        String[] finalWords= new String[count];
        System.arraycopy(words, 0, finalWords, 0, count);
        return finalWords;
    }
}
