package code._4_student_effort.numbersLCD;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class LCDnumbers {
    public static void main(String[] args) {
    String inputFILE = "C:\\development\\WorkSpace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\numbersLCD\\InputNumber.txt";
    String outputFILE = "C:\\development\\WorkSpace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\numbersLCD\\OutputNumber.txt";
    String[] numbersInput = null;
    try{
        numbersInput = readfromFile(inputFILE);
        for(String number : numbersInput){
            int numberofChars = number.length();
            writeInFile(getNumberRepr(number), numberofChars, outputFILE);
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }


    }

    public static int[][][] getNumberRepr(String InputNumber){
        int numberOfChars = InputNumber.length();
        int[][][] chars = new int[numberOfChars][3][3];
        int[][] one = {{0, 0, 0}, {0, 0, 1}, {0, 0, 1}};
        int[][] two = {{0, 1, 0}, {0, 1, 1}, {1, 1, 0}};
        int[][] three = {{0, 1, 0}, {0, 1, 1}, {0, 1, 1}};
        int[][] four = {{0, 0, 0}, {1, 1, 1}, {0, 0, 1}};
        int[][] five = {{0, 1, 0}, {1, 1, 0}, {0, 1, 1}};
        int[][] six = {{0, 1, 0}, {1, 1, 0}, {1, 1, 1}};
        int[][] seven = {{0, 1, 0}, {0, 0, 1}, {0, 0, 1}};
        int[][] eight = {{0, 1, 0}, {1, 1, 1}, {1, 1, 1}};
        int[][] nine = {{0, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        int[][] zero = {{0, 1, 0}, {1, 0, 1}, {1, 1, 1}};


        for (int i = 0; i < numberOfChars; i++) {
            if (InputNumber.charAt(i) == '1') chars[i] = one;
            else if (InputNumber.charAt(i) == '2') chars[i] = two;
            else if (InputNumber.charAt(i) == '3') chars[i] = three;
            else if (InputNumber.charAt(i) == '4') chars[i] = four;
            else if (InputNumber.charAt(i) == '5') chars[i] = five;
            else if (InputNumber.charAt(i) == '6') chars[i] = six;
            else if (InputNumber.charAt(i) == '7') chars[i] = seven;
            else if (InputNumber.charAt(i) == '8') chars[i] = eight;
            else if (InputNumber.charAt(i) == '9') chars[i] = nine;
            else if (InputNumber.charAt(i) == '0') chars[i] = zero;
            else chars[i] = four;
        }
        return chars;
    }


    public static String[] readfromFile(String fileName) throws FileNotFoundException {
        String[] words = new String[0];
        int counter = 0;
        Scanner s = null;
        try{
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            while(s.hasNext()){
                words = Arrays.copyOf(words, words.length +1);
                words[counter++] = s.next();
            }
        }finally{
            if(s != null){
                s.close();
            }
        }
        String [] totalCounts = new String[counter];
        System.arraycopy(words, 0, totalCounts, 0, counter);
        System.out.println(totalCounts);
        return totalCounts;
    }

    public static void writeInFile(int[][][] chars, int numberOfChars, String filename){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
            copy(chars, numberOfChars, bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void copy(int[][][] chars, int numberOfChars, Writer writer) throws IOException {
        try {
            int i, j, k;
            for (j = 0; j < 3; j++) {
                for (i = 0; i < numberOfChars; i++) {
                    for (k = 0; k < 3; k++) {
                        if (chars[i][j][k] == 1) {
                            if (k == 1) writer.write(" _ ");
                            else writer.write("|");
                        } else writer.write(" ");
                    }
                    writer.write(" ");
                }
                writer.write("\n");
            }
        } finally {
            if (writer != null) writer.close();
        }
    }
}
