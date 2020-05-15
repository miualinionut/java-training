package code._4_student_effort;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberToLCD {
    public static void main(String[] args) {
        // Read the input
        long numberToConvert = -1;
        String inputFilePath = "_4_exceptions_io/_test_files/in/input_number.txt";
        String outputFilePath = "_4_exceptions_io/_test_files/out/student_LCD_Num.txt";
        Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(inputFilePath)));
            numberToConvert = scanner.nextLong();
        } catch (FileNotFoundException e) {
            System.out.println("There was a problem while reading input!");
        }
        // Convert each digit to LCD Number
        convertDigitToLCDAndPrintIt(numberToConvert, outputFilePath);
        // While converting print every digit

    }

    private static void convertDigitToLCDAndPrintIt(long numberToConvert, String outputPath) {
        // Reverse the number
        long reversedNumber = reverseNumber(numberToConvert);
        byte currentDigit;
        // create Writer
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(outputPath));
        } catch (IOException e) {
            System.out.println("There was a problem while writing to file");
        }
        if (null != writer) {
            try {
                List<StringBuilder> lines = new ArrayList<>();
                lines.add(new StringBuilder());
                lines.add(new StringBuilder());
                lines.add(new StringBuilder());
                lines.add(new StringBuilder());
                lines.add(new StringBuilder());
                while (reversedNumber > 0) {
                    // Take every digit and convert it
                    currentDigit = (byte) (reversedNumber % 10);
                    // print the converted digit
                    printLCDDigitOn5LinesToFile(currentDigit, lines);
                    reversedNumber /= 10;
                }
                for (StringBuilder line : lines) {
                    writer.write(line.toString() + "\n");
                }
                // Close file
                writer.close();
            } catch (IOException e) {
                System.out.println("Problem while writing to file");
            }
        }
    }

    private static void printLCDDigitOn3LinesToFile(byte currentDigit, List<StringBuilder> lines) {
        String firstLine = null;
        String secondLine = null;
        String thirdLine = null;
        switch (currentDigit) {
            case 1:
                firstLine = "   ";
                secondLine = " | ";
                thirdLine = " | ";
                break;
            case 2:
                firstLine = " _ ";
                secondLine = " _|";
                thirdLine = "|_ ";
                break;
            case 3:
                firstLine = " _ ";
                secondLine = " _|";
                thirdLine = " _|";
                break;
            case 4:
                firstLine = "   ";
                secondLine = "|_|";
                thirdLine = "  |";
                break;
            case 5:
                firstLine = " _ ";
                secondLine = "|_ ";
                thirdLine = " _|";
                break;
            case 6:
                firstLine = " _ ";
                secondLine = "|_ ";
                thirdLine = "|_|";
                break;
            case 7:
                firstLine = " _ ";
                secondLine = "  |";
                thirdLine = "  |";
                break;
            case 8:
                firstLine = " _ ";
                secondLine = "|_|";
                thirdLine = "|_|";
                break;
            case 9:
                firstLine = " _ ";
                secondLine = "|_|";
                thirdLine = " _|";
                break;
        }
        lines.get(0).append(firstLine);
        lines.get(1).append(secondLine);
        lines.get(2).append(thirdLine);
    }

    private static void printLCDDigitOn5LinesToFile(byte currentDigit, List<StringBuilder> lines) {
        String firstLine = null;
        String secondLine = null;
        String thirdLine = null;
        String forthLine = null;
        String fifthLine = null;
        switch (currentDigit) {
            case 1:
                firstLine = "   ";
                secondLine = " | ";
                thirdLine = " | ";
                forthLine = " | ";
                fifthLine = " | ";
                break;
            case 2:
                firstLine = " __ ";
                secondLine = "   |";
                thirdLine = " __|";
                forthLine = "|   ";
                fifthLine = "|__ ";
                break;
            case 3:
                firstLine = " __ ";
                secondLine = "   |";
                thirdLine = " __|";
                forthLine = "   |";
                fifthLine = " __|";
                break;
            case 4:
                firstLine = "     ";
                secondLine = " |  |";
                thirdLine = " |__|";
                forthLine = "    |";
                fifthLine = "    |";
                break;
            case 5:
                firstLine = "  __ ";
                secondLine = " |   ";
                thirdLine = " |__ ";
                forthLine = "    |";
                fifthLine = "  __|";
                break;
            case 6:
                firstLine = "  __ ";
                secondLine = " |   ";
                thirdLine = " |__ ";
                forthLine = " |  |";
                fifthLine = " |__|";
                break;
            case 7:
                firstLine = "  __ ";
                secondLine = "    |";
                thirdLine = "    |";
                forthLine = "    |";
                fifthLine = "    |";
                break;
            case 8:
                firstLine = "  __ ";
                secondLine = " |  |";
                thirdLine = " |__|";
                forthLine = " |  |";
                fifthLine = " |__|";
                break;
            case 9:
                firstLine = "  __ ";
                secondLine = " |  |";
                thirdLine = " |__|";
                forthLine = "    |";
                fifthLine = "  __|";
                break;
        }
        lines.get(0).append(firstLine);
        lines.get(1).append(secondLine);
        lines.get(2).append(thirdLine);
        lines.get(3).append(forthLine);
        lines.get(4).append(fifthLine);
    }

    private static long reverseNumber(long numberToConvert) {
        long reversedNumber = 0;
        while (numberToConvert > 0) {
            reversedNumber = reversedNumber * 10 + numberToConvert % 10;
            numberToConvert /= 10;
        }
        return reversedNumber;
    }

}
