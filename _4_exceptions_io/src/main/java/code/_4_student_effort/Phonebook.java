package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        String[] names = {"Abbey", "Abdul"};
        String fileName = "_4_exceptions_io\\_test_files\\in\\phonebook.txt";
        String[] phonebookWords = read(fileName);
        getPhoneNumber(phonebookWords, names);
    }
    public static String[] read(String fileName){
        String[] words = {};
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(fileName)))){
            while (s.hasNext()){
                String word = s.next();
                words = Arrays.copyOf(words, words.length+1);
                words[words.length-1] = word;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return words;
    }

    public static void getPhoneNumber(String[] phonebook, String[] names){
        for(int i = 0; i<phonebook.length; i++){
            for (String name : names){
                if(phonebook[i].equals(name)){
                    System.out.println(name+":"+phonebook[i+1]);
                }
            }
        }
    }
}
