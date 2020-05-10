package code._4_student_effort.SecretMessage;

import java.io.*;
import java.util.logging.FileHandler;

public class SecretMessage {

    public static StringBuffer secretMessage(String fileName){

        StringBuffer message = new StringBuffer("");

        File file = new File(fileName);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            char currentChar;
            while((currentChar = (char) br.read())!= (char)-1){
                if(Character.isUpperCase(currentChar) && currentChar!='X'){
                    message.append(currentChar);
                }
                else if(currentChar == 'X'){
                    message.append(' ');
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }

    public static void main(String[] args) {
        String fisierInput = "C:/development/workspace/java-training/_4_exceptions_io/_test_files/in/message.txt";
        StringBuffer mesaj = secretMessage(fisierInput);
        System.out.println(mesaj);
    }
}
