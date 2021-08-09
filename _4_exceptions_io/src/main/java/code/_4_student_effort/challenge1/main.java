package code._4_student_effort.challenge1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class main {

        public static void main( String[] args ) throws IOException
        {
            try{
                HashMap<String,String> phonebook = Read();
                System.out.println("Abbey phone number: " + phonebook.get("Abbey"));
                System.out.println("Abdul phone number: " + phonebook.get( "Abdul"));
            } catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }

        private static HashMap Read() throws IOException{
            String filePath = "C:\\development\\workspace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\challenge1\\phonebook.txt";
            HashMap<String, String> map = new HashMap<String, String>();

            String line;
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null)
            {
                String[] parts = line.split(" ", 2);
                if (parts.length >= 2)
                {
                    String key = parts[0];
                    String value = parts[1];
                    map.put(key, value);
                } else {
                    System.out.println("ignored line" + line);
                }
            }

            reader.close();
            return map;
        }

}
