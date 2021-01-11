package code._4_student_effort.numbers_to_lcd;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberToLcd {
    private static final String INPUT_FILE = "_4_exceptions_io\\_test_files\\in\\input_number.txt";
    private static final String OUTPUT_FILE = "_4_exceptions_io\\_test_files\\out\\output_number.txt";


    private static String getNumberRepresentation(String number) {
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

        for (int i = 0; i < numberOfChars; i++) {
            switch (number.charAt(i)) {
                case '1':
                    chars[i] = one;
                    break;
                case '2':
                    chars[i] = two;
                    break;
                case '3':
                    chars[i] = three;
                    break;
                case '4':
                    chars[i] = four;
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
                case '0':
                    chars[i] = zero;
                    break;
            }
        }

        return getLCDNumber(chars, numberOfChars);
    }

    private static String getLCDNumber(int[][][] chars, int numberOfChars) {
        String numberLCD = "";
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < numberOfChars; i++) {
                for (int k = 0; k < 3; k++) {
                    if (chars[i][j][k] == 1) {
                        if (k == 1) {
                            numberLCD += "_";
                        } else {
                            numberLCD += "|";
                        }
                    } else {
                        numberLCD += " ";
                    }
                }
                numberLCD += " ";
            }
            numberLCD += "\n";
        }

        return numberLCD;
    }

    public String readInput(String path) {
        Scanner scanner = null;
        String number = "";
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(path)));

            while (scanner.hasNext()) {
                number = scanner.next();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        return number;
    }

    public void writeOutput(String path, String numberLCD) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path));
            bufferedWriter.write(numberLCD + "\n");

            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NumberToLcd obj = new NumberToLcd();
        String numberFromInput = obj.readInput(INPUT_FILE);
        //numberFromInput = "1234567890";

        String numberLCD = NumberToLcd.getNumberRepresentation(numberFromInput);
        obj.writeOutput(OUTPUT_FILE, numberLCD);
        System.out.print(numberLCD);

    }

}
