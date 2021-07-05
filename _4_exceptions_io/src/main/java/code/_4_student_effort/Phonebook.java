package code._4_student_effort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Phonebook {

    public static File file = new File("_4_exceptions_io\\_test_files\\in\\phonebook.txt");

    public static void main(String[] args){
        try{
            System.out.println("The numbers are:  ");
            String[] phoneBook = readPhoneBook(file);
            int i=0;
            while(phoneBook[i]!=null){
                if (phoneBook[i].equals("Abbey")||phoneBook[i].equals("Abdul"))
                    System.out.println(phoneBook[i+1]);
                i++;
            }
        }
        catch (FileNotFoundException e){
            System.out.println("exception");
        }
    }

    public static String[] readPhoneBook(File file) throws FileNotFoundException{

        int count=0;
        String[] phoneBook = new String[10000];
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            phoneBook[count]=sc.next();
            count++;
        }
        return phoneBook;
    }
}
