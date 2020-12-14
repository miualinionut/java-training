package code._4_student_effort.Phonebook;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class Phonebook {
        private  final static int  NumberOfLines = 4332;
        public static void main(String[] args){
            try{
                String[] totalWords = read("C:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\in\\phonebook.txt");
                System.out.println(search("Abbey",totalWords));
                System.out.println(search("Abdul",totalWords));
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }

        public static String search(String name,String[] totalWords){
            for(int i = 0; i < NumberOfLines; i++){
                if(totalWords[i].equals(name)){
                    return totalWords[i + 1];
                }
            } return "Number not found";
        }
        public static String[] read(String fileName) throws FileNotFoundException{
            String[] words = new String[NumberOfLines];
            Scanner s = null;
            int counter = 0;
            try {
                s = new Scanner(new BufferedReader(new FileReader(fileName)));
                s.useLocale(Locale.US);
                while (s.hasNext() && counter < NumberOfLines){
                    words[counter++] = s.next();
                }
            }finally {
                if(s!= null){
                    s.close();
                }
            }
            String[] array = new String[counter];
            System.arraycopy(words,0,array,0,counter);
            return array;

        }
}
