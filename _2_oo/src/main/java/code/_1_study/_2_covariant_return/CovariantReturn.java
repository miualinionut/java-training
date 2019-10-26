package code._1_study._2_covariant_return;

public class CovariantReturn {

  public Number getNumber() {
    Integer i = 1;
    Long l = 1L;
    Double d = 1.0d;
    Object o = new Object();

    return i; //valid
    //return l; //valid
    //return d; //valid
    //return o; //invalid
  }


}
