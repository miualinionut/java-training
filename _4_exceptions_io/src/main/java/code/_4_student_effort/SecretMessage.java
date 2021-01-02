package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        String fileName = "_4_exceptions_io\\_test_files\\in\\message.txt";
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(fileName)))){
            s.useDelimiter(" ");
            while (s.hasNext()){
                String word = s.next();
                for(int i=0; i<word.length();i++){
                    if(Character.isUpperCase(word.charAt(i)) ){
                        if(word.charAt(i) == 'X'){
                            System.out.print(" ");
                        }
                        else{
                        System.out.print(word.charAt(i));}
                    }
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
