package code._1_study._1_pecs;

import java.util.ArrayList;
import java.util.List;

public class Pecs {

  public static void main(String[] args) {
    List<? extends Number> pe = new ArrayList<>();
    List<? super Number> cs = new ArrayList<>();

    //pe.add(Integer.valueOf(1)); //compile-time error, why ?
    //this will not work because type <? extends Number> implies that we can add instances of classes that are not known

    cs.add(Integer.valueOf(1)); //valid, why ?
  }
}
