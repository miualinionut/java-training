package code._4_student_effort;

import java.io.*;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    //exercitiul 2

    File file = new File("C:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\in\\message.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));
    String line;
    char c = 'X';
    StringBuilder sb = new StringBuilder();

    try{
      while((line = br.readLine()) != null){
        for (int i = 0; i < line.length(); i++) {
          if (Character.isUpperCase(line.charAt(i)) && line.charAt(i) != c) {
            sb.append(line.charAt(i));
          } else if (line.charAt(i) == c) {
            sb.append(" ");
          }
        }
      }
      br.close();
    }catch(IOException x){
      x.printStackTrace();
    }finally {

      System.out.println(sb);
    }
  }
}
