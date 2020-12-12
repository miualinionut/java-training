package code._4_student_effort;

import java.util.Scanner;
import java.io.*;

public class NrToLCD {
    public static void main(String[] args) throws FileNotFoundException{
        int width = 3, height = 3;
        int currInt;
        String aux;
        Scanner sc = new Scanner(System.in);

        // System.out.println("Input width: ");
        // width = sc.nextInt();
        //  System.out.println("Input height: ");
        //  height = sc.nextInt();


        File input = new File("C:\\Development\\workspace\\java-training\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\LCDinput.txt");
        Scanner fileScanner = new Scanner(input);
        while(fileScanner.hasNext()){
            aux = fileScanner.next();
            currInt = Integer.parseInt(aux);

        }

    }


}
