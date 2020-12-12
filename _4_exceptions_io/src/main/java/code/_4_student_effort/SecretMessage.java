package code._4_student_effort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        try {
            File input = new File("C:\\Development\\workspace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\SecretMessage.txt");
            Scanner reader = new Scanner(input);
            String finalMessage = "";
            String aux;
            int i;
            while(reader.hasNextLine()){
                aux = reader.next();
                for(i = 0; i < aux.length(); i++){
                    if (Character.isUpperCase(aux.charAt(i))){
                        if(aux.charAt(i) != 'X') {
                            finalMessage += aux.charAt(i);
                        }
                        else{
                            finalMessage += ' ';
                        }
                    }
                }
            }
            System.out.println(finalMessage);
        }
        catch(FileNotFoundException e){
            System.out.println("File could not be opened");
            e.printStackTrace();
        }
    }
}
