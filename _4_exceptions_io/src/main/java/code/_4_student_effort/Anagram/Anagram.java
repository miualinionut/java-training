package code._4_student_effort.Anagram;


import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.Scanner;

public class Anagram {


    public static void createAnagram(String inputPath,String outputPath)throws FileNotFoundException {


        try {

            String listen="listen";
            File input = null;
            Scanner scan=null;
            input = new File(inputPath);
            scan= new Scanner(input);
            FileWriter myWriter = new FileWriter(outputPath);
            while(scan.hasNextLine()) {
                String aux = scan.next();
                String copy = aux;
                if (aux.length() == listen.length()) {
                    for (int i = 0; i < listen.length(); i++) {
                        {
                            if (aux.indexOf(listen.charAt(i)) != -1) {
                                String aux2 = aux.replaceFirst(String.valueOf(listen.charAt(i)), "");
                                aux = aux2;

                            }
                        }
                    }
                    if (aux.equals("")) {
                        myWriter.write(copy + '\n');
                    }

                }
            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {


        String input="C:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\in\\big_list.txt";
        String output="C:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\out\\output.txt";
        try {
            createAnagram(input,output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
