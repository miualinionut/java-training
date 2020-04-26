package code._3_in_class;
import java.util.Date;

public class Main {

  public static void main(String[] args) {
    int i=5;//primitiva

    Masina m=new Masina();
    m.start();
    m.steer();
    m.stop();
    Date d=m.getDataFabricatie();
    d.setYear(1800);
  }
}