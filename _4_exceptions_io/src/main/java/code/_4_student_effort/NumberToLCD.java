package code._4_student_effort;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class NumberToLCD {
    public static void main(String[] args) {
        String inputFileName = "_4_exceptions_io\\_test_files\\in\\inputLCD.txt";
        String outputFileName = "_4_exceptions_io\\_test_files\\out\\LCDoutput.txt";
        String[] number = readNumber(inputFileName);
        writeToFile(outputFileName, convertToLCDNumber(number));
    }

    public static String[] readNumber(String fileName){
        String[] digits = {};
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(fileName)))){
            while (s.hasNext()){
                String digit = s.next();
                digits = Arrays.copyOf(digits, digits.length+1);
                digits[digits.length-1] = digit;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return digits;
    }

    public static int[][][] convertToLCDNumber(String[] number){
        int[][][] numberLCD={};
        for(String digits : number){
            for(int i =0; i < digits.length(); i++){
                numberLCD = Arrays.copyOf(numberLCD, numberLCD.length+1);
                numberLCD[numberLCD.length-1] = digitLCD(Character.getNumericValue(digits.charAt(i)));
            }
        }
        return numberLCD;
    }

    private static int[][] digitLCD(int digit) {
        int[][] digitLCD={};
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
        switch (digit) {
            case 0:
                digitLCD = zero; break;
            case 1:
                digitLCD = one; break;
            case 2:
                digitLCD = two; break;
            case 3:
                digitLCD = three; break;
            case 4:
                digitLCD = four; break;
            case 5:
                digitLCD = five; break;
            case 6:
                digitLCD = six; break;
            case 7:
                digitLCD = seven; break;
            case 8:
                digitLCD = eight;break;
            case 9:
                digitLCD= nine; break;
        }
        return digitLCD;
    }

    public static void writeToFile(String fileName, int[][][] number){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            for (int i = 0; i<3; i++){
                for (int[][] digit : number) {
                    for (int j=0; j<3; j++) {
                        if (digit[i][j] != 0) {
                            if (j == 1) {
                                writer.write("_");
                            } else {
                                writer.write("|");
                            }
                        } else writer.write(" ");
                    }
                }
                writer.newLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
