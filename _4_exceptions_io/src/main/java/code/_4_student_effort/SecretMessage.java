package code._4_student_effort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SecretMessage {

    private static File file = new File("_4_exceptions_io\\_test_files\\in\\message.txt");

    public static void main(String[] args){
        try {
            String secretMessage = "";
            String[] words = readFile(file);
            String word;
            char[] characters;
            int i=0;
            while(words[i]!=null){
                word=words[i];
                characters=word.toCharArray();
                for (char character:characters) {
                    if(Character.isUpperCase(character)){
                        if(character == 'X')
                            secretMessage += ' ';
                        else
                            secretMessage += character;

                    }
                }
                i++;
            }
            System.out.println(secretMessage);
        }
        catch (FileNotFoundException e){
            System.out.println("exception");
        }
    }

    public static String[] readFile(File file) throws FileNotFoundException {
        String[] words = new String[1000000];
        Scanner scanner = new Scanner(file);
        int i=0;
        while(scanner.hasNext()){
            words[i]=scanner.next();
            i++;
        }
        return words;
    }
}
