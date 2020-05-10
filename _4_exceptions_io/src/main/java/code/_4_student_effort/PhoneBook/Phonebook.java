package code._4_student_effort.PhoneBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Phonebook {


    public static void findNumber(String name,String path){

        File phonebook=null;
        Scanner scan=null;
        try {

            phonebook = new File(path);
            scan = new Scanner(phonebook);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        while(scan.hasNextLine()){


            String str=scan.next();
            if(str.equals(name)){
                System.out.println(scan.next());
            }

        }
    }

    public static void main(String[] args) {


        String path="C:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\in\\phonebook.txt";

        findNumber("Abbey", path);
        findNumber("Abdul", path);





    }
}
