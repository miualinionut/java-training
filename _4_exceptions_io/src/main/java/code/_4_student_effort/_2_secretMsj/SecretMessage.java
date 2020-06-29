package code._4_student_effort._2_secretMsj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        try {
            StringBuilder dataText = readFromFile("_4_exceptions_io\\_test_files\\in\\message.txt");
            System.out.println(dataText);
            System.out.println(findSecret(readFromFile("_4_exceptions_io\\_test_files\\in\\message.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static StringBuilder readFromFile(String filename) throws FileNotFoundException{
        StringBuilder message = new StringBuilder();
        Scanner s = null;
        try{
            s = new Scanner(new BufferedReader(new FileReader(filename)));
            while (s.hasNext()) {
                message.append(s.next());
            }
        } finally {
            if (s != null) s.close();
        }
        message.toString();
        return message;
    }

    private static String findSecret(StringBuilder message){
        String secretMessage = "";
        for(int i = 0; i < message.length(); i++){
            char ch = message.charAt(i);
            if(Character.isUpperCase(ch) && ch != 'X'){
                secretMessage = secretMessage + ch;
            }
            if(Character.isUpperCase(ch) && ch == 'X'){
                secretMessage = secretMessage + " ";
            }
        }
        return secretMessage;
    }
}
