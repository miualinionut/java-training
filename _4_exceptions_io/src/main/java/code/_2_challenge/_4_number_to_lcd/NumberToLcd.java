package code._2_challenge._4_number_to_lcd;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class NumberToLcd {
    private static final String INPUT_FILE = "_4_exceptions_io\\_test_files\\in\\input_number.txt";
    private static final String OUTPUT_FILE = "_4_exceptions_io\\_test_files\\out\\output_number.txt";

    public static void main(String[] args) {
        String[] numbersFromFile = new String[0];
        try {
            numbersFromFile = readListOfWords(INPUT_FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (String number : numbersFromFile) {
            int numberOfChars = number.length();
            writeInFile(getNumberRepresentation(number), numberOfChars, OUTPUT_FILE);
        }
    }

    private static int[][][] getNumberRepresentation(String number) {
        int numberOfChars = number.length();
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
        int i, j, k;

        for (i = 0; i < numberOfChars; i++) {
            if (number.charAt(i) == '1') chars[i] = one;
            else if (number.charAt(i) == '2') chars[i] = two;
            else if (number.charAt(i) == '3') chars[i] = three;
            else if (number.charAt(i) == '4') chars[i] = four;
            else if (number.charAt(i) == '5') chars[i] = five;
            else if (number.charAt(i) == '6') chars[i] = six;
            else if (number.charAt(i) == '7') chars[i] = seven;
            else if (number.charAt(i) == '8') chars[i] = eight;
            else if (number.charAt(i) == '9') chars[i] = nine;
            else if (number.charAt(i) == '0') chars[i] = zero;
            else chars[i] = four;
        }
        return chars;
    }

    private static String[] readListOfWords(String fileName) throws FileNotFoundException {
        String[] words = new String[0];
        Scanner s = null;
        int wordCount = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            s.useLocale(Locale.US);
            while (s.hasNext()) {
                words = Arrays.copyOf(words, words.length + 1);
                words[wordCount++] = s.next();
            }
        } finally {
            if (s != null) s.close();
        }

        String[] appropriateLengthWordsArray = new String[wordCount];
        System.arraycopy(words, 0, appropriateLengthWordsArray, 0, wordCount);
        return appropriateLengthWordsArray;
    }

    private static void writeInFile(int[][][] chars, int numberOfChars, String fileName) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
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
                            if (k == 1) writer.write("_");
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
