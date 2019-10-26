package code._1_study._8_character_streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {

  public static void main(String[] args) throws IOException {
    read("_4_exceptions_io\\_test_files\\in\\small_input.txt");

    String writePath = "_4_exceptions_io\\_test_files\\out\\small_output.txt";
    write(writePath, "how are you ?");
    read(writePath);
  }

  private static void read(String filePath) throws IOException {
    FileReader reader = new FileReader(filePath);

    int c = reader.read();
    while (c != -1) {
      char character = (char) c;
      System.out.print(character);
      c = reader.read();
    }
    reader.close();
    System.out.println();
  }

  private static void write(String filePath, String msg) throws IOException {
    FileWriter writer = new FileWriter(filePath);
    writer.write(msg);
    writer.close();
  }
}
