package code._4_student_effort.CodeChallange2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        try {
            List<String> textMessage = readText("_4_exceptions_io\\_test_files\\in\\message.txt");
            String secretMessage = readSecretMessage(textMessage);
            System.out.println(secretMessage);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private static String readSecretMessage(List<String> textMessage){
        String secretMessage = "";
        for(String word : textMessage){
            for(char letter : word.toCharArray()){
                if(Character.isUpperCase(letter)){
                    if(letter == 'X'){
                        secretMessage += " ";
                    }
                    else{
                        secretMessage += letter;
                    }
                }
            }
        }

        return secretMessage;
    }

    private static List<String> readText(String filename) throws FileNotFoundException {
        List<String> textMessage = new ArrayList<>();
        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(filename)));
            s.useLocale(Locale.US);
            while (s.hasNext()){
                textMessage.add(s.next());
            }
        } finally {
            if(s != null){
                s.close();
            }
        }
        return textMessage;
    }
}
