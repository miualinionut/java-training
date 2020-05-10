package code._4_student_effort.NumberToLCD;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LCDTest {

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

    static void printToScreen(String number){
        int[][][] representation = getNumberRepresentation(number);
        for(int i = 0; i < number.length(); i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    if(representation[i][j][k] == 1) {
                        if (k% 2 == 0)
                            System.out.print("|");
                        else System.out.print("_");
                    }
                       else if ( k == 1 && representation[i][j][k] == 0)
                           System.out.print(" ");
                       else System.out.print(" ");
                    }
                 System.out.println();
                }
            }
    }

    static void printToFile(String number, String filename){
        File file = new File(filename);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter fout = new BufferedWriter(fw);

            int[][][] representation = getNumberRepresentation(number);
            for(int i = 0; i < number.length(); i++){
                for(int j = 0; j < 3; j++){
                    for(int k = 0; k < 3; k++){
                        if(representation[i][j][k] == 1) {
                            if (k% 2 == 0)
                                fout.write("|");
                            else fout.write("_");
                        }
                        else if ( k == 1 && representation[i][j][k] == 0)
                            fout.write(" ");
                        else fout.write(" ");
                    }
                    fout.write("\n");
                }
            }
            fout.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public static void main(String[] args) {
        printToScreen("023345679");

        String fisier = "C:/development/workspace/java-training/_4_exceptions_io/_test_files/out/output_number.txt";
        printToFile("1234",fisier);
    }
}
