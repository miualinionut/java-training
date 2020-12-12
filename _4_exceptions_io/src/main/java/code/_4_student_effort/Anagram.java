package code._4_student_effort;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
            File input = new File("C:\\Development\\workspace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\words.txt");
            File output = new File("C:\\Development\\workspace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\anagramOutput.txt");
            try{
            FileWriter outputWriter = new FileWriter(output);
            PrintWriter outputPrinter = new PrintWriter(outputWriter);

            Scanner reader = new Scanner(input);

            String string1 = "listen";
            String string2;
            char[] charArr1 = string1.toCharArray();
            char[] charArr2;
            Arrays.sort(charArr1);
            while(reader.hasNext()) {
                string2 = reader.next();
                charArr2 = string2.toCharArray();
                Arrays.sort(charArr2);
                    if (Arrays.equals(charArr1,charArr2)) {
                        System.out.println(string2);
                        outputPrinter.println(string2);
                    }
                }
                outputWriter.close();
                outputPrinter.close();
            }

            catch(IOException i) {
                System.out.println("write failed");
                i.printStackTrace();
        }

    }
}

