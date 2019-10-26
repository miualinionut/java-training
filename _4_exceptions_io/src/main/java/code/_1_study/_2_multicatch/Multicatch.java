package code._1_study._2_multicatch;

import java.io.IOException;
import java.sql.SQLException;

public class Multicatch {

  /*
  from terminal use command javap -c Multicatch.class and check the exception table
   */
  public static void main(String[] args) {
    try {
      if (1 == 1) throw new IOException("");
      if (1 == 2) throw new SQLException("");
    } catch (IOException | SQLException ex) {
      System.out.println(ex);
    }
  }
}
