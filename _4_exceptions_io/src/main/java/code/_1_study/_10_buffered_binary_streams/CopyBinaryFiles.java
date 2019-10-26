package code._1_study._10_buffered_binary_streams;

import java.io.*;
import java.time.Duration;
import java.time.Instant;

public class CopyBinaryFiles {

  public static void main(String[] args) throws IOException {
    FileInputStream nonBufferedReader = new FileInputStream("_4_exceptions_io\\_test_files\\in\\a.jpg");
    FileOutputStream nonBufferedWriter = new FileOutputStream("_4_exceptions_io\\_test_files\\out\\aNonBuffered.jpg");
    printCopyDuration("non-buffered", nonBufferedReader, nonBufferedWriter);

    BufferedInputStream bufferedReader = new BufferedInputStream(new FileInputStream("_4_exceptions_io\\_test_files\\in\\a.jpg"));
    BufferedOutputStream bufferedWriter = new BufferedOutputStream(new FileOutputStream("_4_exceptions_io\\_test_files\\out\\aBuffered.jpg"));
    printCopyDuration("buffered", bufferedReader, bufferedWriter);
  }

  private static void printCopyDuration(String msg, InputStream reader, OutputStream writer) throws IOException {
    Instant start = Instant.now();
    copy(reader, writer);
    Instant stop = Instant.now();
    Duration duration = Duration.between(start, stop);
    System.out.println(msg + ": " + duration);
  }

  private static void copy(InputStream reader, OutputStream writer) throws IOException {
    try {
      int c;
      while ((c = reader.read()) != -1) {
        writer.write(c);
      }
    } finally {
      if (reader != null) reader.close();
      if (writer != null) writer.close();
    }
  }
}
