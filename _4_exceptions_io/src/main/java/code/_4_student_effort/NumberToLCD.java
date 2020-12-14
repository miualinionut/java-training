package code._4_student_effort;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class NumberToLCD {

    private static String[] OpenText(String file) throws FileNotFoundException {
        String[] words = new String[0];
        int NumberOfWords=0;
        Scanner scan = null;
        try {
            scan = new Scanner(new BufferedReader(new FileReader(file)));
            scan.useLocale(Locale.US);
            while (scan.hasNext()) {
                words = Arrays.copyOf(words,words.length+1);
                words[NumberOfWords] = scan.next();
            }
        } finally {
            if (scan != null) scan.close();
        }
        String[] WordsArray = new String[NumberOfWords];
        System.arraycopy(words, 0, WordsArray, 0, NumberOfWords);
        return WordsArray;
    }

    private static void Copy(int[][][] chars, int numberOfChars, Writer writer) throws IOException {
        try {
            for(int i = 0; i < 3; i++){
                for(int j = 0; j<numberOfChars; j++){
                    for(int k = 0; k <3; k++){
                        if(chars[j][i][k] == 1){
                            if(k == 1)
                                writer.write("_");
                            else
                                writer.write("|");
                        }
                        else writer.write(" ");
                    }
                    writer.write(" ");
                }
                writer.write("\n");
            }

        }
        finally {
            if(writer != null)
                writer.close();
        }

    }

    private static void WriteText(int[][][] chars, int numberOfChars, String file) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            Copy(chars, numberOfChars, bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[][][] NumberRepresentation(String Number) {
        int CharsNo = Number.length();
        int[][][] chars = new int[CharsNo][3][3];
        int[][] zero = {{0, 1, 0}, {1, 0, 1}, {1, 1, 1}};
        int[][] one = {{0, 0, 0}, {0, 0, 1}, {0, 0, 1}};
        int[][] two = {{0, 1, 0}, {0, 1, 1}, {1, 1, 0}};
        int[][] three = {{0, 1, 0}, {0, 1, 1}, {0, 1, 1}};
        int[][] four = {{0, 0, 0}, {1, 1, 1}, {0, 0, 1}};
        int[][] five = {{0, 1, 0}, {1, 1, 0}, {0, 1, 1}};
        int[][] six = {{0, 1, 0}, {1, 1, 0}, {1, 1, 1}};
        int[][] seven = {{0, 1, 0}, {0, 0, 1}, {0, 0, 1}};
        int[][] eight = {{0, 1, 0}, {1, 1, 1}, {1, 1, 1}};
        int[][] nine = {{0, 1, 0}, {1, 1, 1}, {0, 1, 1}};

        for (int i = 0; i < CharsNo; i++) {
            switch (Number.charAt(i)) {
                case '0':
                    chars[i] = zero;
                    break;
                case '1':
                    chars[i] = one;
                    break;
                case '2':
                    chars[i] = two;
                    break;
                case '3':
                    chars[i] = three;
                    break;
                case '5':
                    chars[i] = five;
                    break;
                case '6':
                    chars[i] = six;
                    break;
                case '7':
                    chars[i] = seven;
                    break;
                case '8':
                    chars[i] = eight;
                    break;
                case '9':
                    chars[i] = nine;
                    break;
                default:
                    chars[i] = four;
            }

        }
        return chars;
    }

    public static void main(String[] args) {
        String[] numbers = new String[0];
        try {
                numbers = OpenText("_4_exceptions_io\\_test_files\\in\\input_number.txt");
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        }
            for (String number : numbers) {
                int numberOfChars = number.length();
                WriteText(NumberRepresentation(number), numberOfChars,"_4_exceptions_io\\_test_files\\out\\output_number.txt");
            }
        }
}
