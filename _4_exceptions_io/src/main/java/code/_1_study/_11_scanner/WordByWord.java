package code._1_study._11_scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordByWord {

  public static void main(String[] args) {
    try(Scanner s = new Scanner(new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\small_input.txt")))) {
      s.useDelimiter(" ");
      while (s.hasNext()) {
        String word = s.next();
        System.out.println(word);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
