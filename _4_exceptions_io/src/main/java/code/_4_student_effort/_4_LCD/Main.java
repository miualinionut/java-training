package code._4_student_effort._4_LCD;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static SevenSegmentDigit zeroDigit;
    static SevenSegmentDigit oneDigit;
    static SevenSegmentDigit twoDigit;
    static SevenSegmentDigit threeDigit;
    static SevenSegmentDigit fourDigit;
    static SevenSegmentDigit fiveDigit;
    static SevenSegmentDigit sixDigit;
    static SevenSegmentDigit sevenDigit;
    static SevenSegmentDigit eightDigit;
    static SevenSegmentDigit nineDigit;
    static ArrayList<SevenSegmentDigit> digitSequence;
    static String numberToDisplay;

    public static void initializeDigits(){
        zeroDigit  = new SevenSegmentDigit(true,  true, true, true,  true,  true,  false);
        oneDigit   = new SevenSegmentDigit(false, true, true, false, false, false, false);
        twoDigit   = new SevenSegmentDigit(true,  true, false,true,  true,  false, true);
        threeDigit = new SevenSegmentDigit(true,  true, true, true,  false, false, true);
        fourDigit  = new SevenSegmentDigit(false, true, true, false, false, true,  true);
        fiveDigit  = new SevenSegmentDigit(true,  false,true, true,  false, true,  true);
        sixDigit   = new SevenSegmentDigit(true,  false,true, true,  true,  true,  true);
        sevenDigit = new SevenSegmentDigit(true,  true, true, false, false, false, false);
        eightDigit = new SevenSegmentDigit(true,  true, true, true,  true,  true,  true);
        nineDigit  = new SevenSegmentDigit(true,  true, true, true,  false, true,  true);
    }

    public static void readNumber(){

        try {
            File inputFile = new File("C:\\Users\\SiV\\development\\workspace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\_4_LCD\\input.txt");
            Scanner reader = new Scanner(inputFile);

            if(reader.hasNextLine()){
                numberToDisplay = reader.nextLine();
            }
            numberToDisplay = numberToDisplay.trim();
        }
        catch (FileNotFoundException e){
            System.out.println("Error, File not found.");
            e.printStackTrace();
        }
    }

    public static void createDigitSequence(String number){
        digitSequence = new ArrayList<>();
        char[] digits = number.toCharArray();
        for(char digit: digits){
            switch (digit) {
                case '1': digitSequence.add(oneDigit); break;
                case '2': digitSequence.add(twoDigit); break;
                case '3': digitSequence.add(threeDigit); break;
                case '4': digitSequence.add(fourDigit); break;
                case '5': digitSequence.add(fiveDigit); break;
                case '6': digitSequence.add(sixDigit); break;
                case '7': digitSequence.add(sevenDigit); break;
                case '8': digitSequence.add(eightDigit); break;
                case '9': digitSequence.add(nineDigit); break;
                case '0': digitSequence.add(zeroDigit); break;
                default: break;
            }
        }
    }

    //Write to file
    public static void printfDigits(int width, int height) {
        try {
            File outputFile = new File("C:\\Users\\SiV\\development\\workspace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\_4_LCD\\output.txt");
            outputFile.createNewFile();
            FileWriter writer = new FileWriter(outputFile);
            StringBuilder line = new StringBuilder();
            for (SevenSegmentDigit digit : digitSequence) {
                line.append(" ");
                for (int i = 0; i < width - 1; i++) {
                    if (digit.a) line.append("_");
                    else line.append(" ");
                }
                line.append("  ");
            }
            writer.write(line.toString());
            line.delete(0, line.length());
            writer.write("\n");
            for (int i = 0; i < height / 2; i++) {
                for (SevenSegmentDigit digit : digitSequence) {
                    if (digit.f) line.append("|");
                    else line.append(" ");
                    if (i == height / 2 - 1) {
                        for (int j = 0; j < width - 1; j++) {
                            if (digit.g) line.append("_");
                            else line.append(" ");
                        }
                    } else {
                        for (int j = 0; j < width - 1; j++) {
                            line.append(" ");
                        }
                    }
                    if (digit.b) line.append("|");
                    else line.append(" ");
                    line.append(" ");
                }
                writer.write(line.toString());
                line.delete(0, line.length());
                writer.write("\n");
            }
            for (int i = 0; i < height / 2; i++) {
                for (SevenSegmentDigit digit : digitSequence) {

                    if (digit.e) line.append("|");
                    else line.append(" ");
                    if (i == height / 2 - 1) {
                        for (int j = 0; j < width - 1; j++) {
                            if (digit.d) line.append("_");
                            else line.append(" ");
                        }
                    } else {
                        for (int j = 0; j < width - 1; j++) {
                            line.append(" ");
                        }
                    }
                    if (digit.c) line.append("|");
                    else line.append(" ");
                    line.append(" ");
                }
                writer.write(line.toString());
                line.delete(0, line.length());
                writer.write("\n");
            }
            writer.close();
    }catch(IOException e){
            e.printStackTrace();
        }
    }

    ///Print on console
    public static void printDigits(int width, int height) {
             for (SevenSegmentDigit digit : digitSequence) {
                System.out.print(" ");
                for (int i = 0; i < width - 1; i++) {
                    if (digit.a) System.out.print("_");
                    else System.out.print(" ");
                }
                System.out.print("  ");
            }
            System.out.println();

        for (int i = 0; i < height / 2; i++) {
                for (SevenSegmentDigit digit : digitSequence) {
                    if (digit.f) System.out.print("|");
                    else System.out.print(" ");
                    if (i == height / 2 - 1) {
                        for (int j = 0; j < width - 1; j++) {
                            if (digit.g) System.out.print("_");
                            else System.out.print(" ");
                        }
                    } else {
                        for (int j = 0; j < width - 1; j++) {
                            System.out.print(" ");
                        }
                    }
                    if (digit.b) System.out.print("|");
                    else System.out.print(" ");
                    System.out.print(" ");
                }
                System.out.println();

            }
            for (int i = 0; i < height / 2; i++) {
                for (SevenSegmentDigit digit : digitSequence) {

                    if (digit.e) System.out.print("|");
                    else System.out.print(" ");
                    if (i == height / 2 - 1) {
                        for (int j = 0; j < width - 1; j++) {
                            if (digit.d) System.out.print("_");
                            else System.out.print(" ");
                        }
                    } else {
                        for (int j = 0; j < width - 1; j++) {
                            System.out.print(" ");
                        }
                    }
                    if (digit.c) System.out.print("|");
                    else System.out.print(" ");
                    System.out.print(" ");
                }
                System.out.println();
            }
        
    }

    public static void main(String[] args){
        initializeDigits();
        readNumber();
        createDigitSequence(numberToDisplay);
        int width  = 7;
        int height = 7;
        printfDigits(width, height);
        printDigits (width, height);
    }
}
