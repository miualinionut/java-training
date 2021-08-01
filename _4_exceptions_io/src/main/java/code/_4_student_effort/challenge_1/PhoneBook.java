package code._4_student_effort.challenge_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        try{
            String abdul = "Abdul";
            String abbey = "Abbey";

            String[] phoneBook = readPhoneBook("_4_exceptions_io\\_test_files\\in\\phonebook.txt");

            System.out.println(searchByName(abdul,phoneBook));
            System.out.println(searchByName(abbey,phoneBook));
        }
        catch(FileNotFoundException ee){
            ee.printStackTrace();
        }

    }

    public static String[] readPhoneBook(String fileName) throws FileNotFoundException {
        String [] words = new String[1000];
        int counter = 0;
        Scanner s = null;
        try{
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            while(s.hasNext() && counter < 1000)
                words[counter++] = s.next();

        }
        finally {
            if(s!=null) s.close();
        }
        String[] finalString = new String[counter];
        System.arraycopy(words,0,finalString,0,counter);
        return finalString;

    }
    public static String searchByName(String name, String[] phoneBook){
        for(int i = 0; i < 1000; i = i + 2)
            if(phoneBook[i].equals(name))
                return phoneBook[i+1];
            return "The Phone number was not found";
    }


}
