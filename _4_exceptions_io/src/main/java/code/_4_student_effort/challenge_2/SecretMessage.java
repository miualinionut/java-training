package code._4_student_effort.challenge_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SecretMessage {


    public static void main(String[] args) {
        try{
            String[] message = readFile("_4_exceptions_io\\_test_files\\in\\message.txt");
            String secretMessage = getCapitalLetters(message);
            System.out.println(secretMessage);


        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }

    public static String getCapitalLetters(String[] message){
        String secretMessage = "";
        for(int i = 0; i< message.length; i++){
            char[] word = new char[message[i].length()];
            word = message[i].toCharArray();

            for(int j = 0; j < word.length; j++){
                if(word[j] == 'X') secretMessage += " ";
                else if(Character.isUpperCase(word[j]) && word[j] != 'X')
                    secretMessage +=word[j];
            }


        }

        return secretMessage;
    }



    public static String[] readFile(String filePath) throws FileNotFoundException {
        String[] words = new String[1000];
        int counter = 0;
        Scanner s = null;
        try{
            s = new Scanner(new BufferedReader(new FileReader(filePath)));
            while(s.hasNext() && counter < 1000)
                words[counter++] = s.next();

        }
        finally {
            if(s != null) s.close();
        }

        String[] accurateLengthString = new String[counter];
        System.arraycopy(words,0,accurateLengthString,0,counter);
        return accurateLengthString;
    }
}
