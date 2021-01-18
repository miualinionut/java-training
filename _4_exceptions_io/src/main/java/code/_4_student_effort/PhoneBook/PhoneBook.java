package code._4_student_effort.PhoneBook;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneBook {
    private static int MAX_NUMBER = 1000;

    public static void main(String[] args) throws IOException {
        try {
            String abbey = "Abbey";
            String abdul = "Abdul";
            String FileName = "C:\\development\\WorkSpace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\PhoneBook\\phonebook.txt";
            //pun numele intr-un tablou de elemente
            String[] wordsInPhoneBook = readfromFile(FileName);

            System.out.println(numberByName(abbey, wordsInPhoneBook));
            System.out.println(numberByName(abdul, wordsInPhoneBook));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static String[] readfromFile(String fileName) throws IOException {
        String[] words = new String[MAX_NUMBER];
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        Scanner s = null;
        int count = 0;
        try{
            s = new Scanner(br);
            while (s.hasNext() && count < MAX_NUMBER){
                words = Arrays.copyOf(words, words.length +1);
                words[count++] = s.next();
            }

        }finally{
            if(s != null) br.close();
        }
        String[] appropriateLengthWordsArray = new String[count];
        System.arraycopy(words, 0, appropriateLengthWordsArray, 0, count);
        return appropriateLengthWordsArray;
    }

    public static String numberByName(String name, String[] wordsInPhoneBook){
        for (int i = 0; i < MAX_NUMBER; i++) {
            if (wordsInPhoneBook[i].equals(name)) {
                return wordsInPhoneBook[i + 1];
            }
        }
        return "The number was not found";
    }
}
