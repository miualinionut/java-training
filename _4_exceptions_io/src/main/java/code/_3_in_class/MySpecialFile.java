package code._3_in_class;

import java.io.FileReader;
import java.io.FileWriter;

public class MySpecialFile {
  public static void main(String[] args) {
    String filePath = "_4_exceptions_io\\_test_files\\in\\small_input.txt";
    String outPath = "_4_exceptions_io\\_test_files\\out\\outpout.txt";

    write(outPath);
    displayContent(outPath);
  }

  private static void displayContent(String filePath) {
    try (FileReader reader = new FileReader(filePath)) {
      int i = reader.read();
      while (i != -1) {
        char c = (char) i;
        System.out.print(c);
        i = reader.read();
      }
    } catch (Exception e) {
      System.out.println("probleme la cititre !!!");
    }
  }

  private static void write(String filePath) {
    try (FileWriter writer = new FileWriter(filePath)) {
      writer.write("ala bala portocala");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
