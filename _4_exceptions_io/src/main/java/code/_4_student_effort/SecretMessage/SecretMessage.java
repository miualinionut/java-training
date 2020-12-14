package code._4_student_effort.SecretMessage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args){
        try{
            System.out.println(getMessage(read("C:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\in\\phonebook.txt")));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private static String getMessage(String[] words){
        String message= " ";
        for(int i = 0;i<words.length;i++){
            String word = words[i];
            char[] letters = word.toCharArray();
            for(char letter : letters){
                if(Character.isUpperCase(letter)){
                    if(letter =='X'){
                        message = message + " ";
                    }
                    else {
                        message = message + letter;
                    }
                }
            }
        }return message;
    }

    private static String[] read(String fileName) throws FileNotFoundException{
        String[] words = new String[0];
        Scanner s = null;
        int counter = 0;
        try{
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            s.useLocale(Locale.US);
            while (s.hasNext()){
                words = Arrays.copyOf(words,words.length + 1);
                words[counter++] = s.next();
            }
        }finally {
            if (s != null) s.close();
        }
        String[] array = new String[counter];
        System.arraycopy(words,0,array,0,counter);
        return array;
    }
}
