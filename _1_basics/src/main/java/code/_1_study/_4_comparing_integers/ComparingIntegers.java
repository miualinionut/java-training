package code._1_study._4_comparing_integers;

public class ComparingIntegers {
  public static void main(String[] args) {
    /*EX 1 */
    Integer i1 = 127;
    Integer i2 = 127;
    System.out.println(i1.equals(i2)); //why ?
    System.out.println(i1 == i2); //why ?

    /*EX 2 */
    Integer i11 = Integer.valueOf(127);
    Integer i22 = Integer.valueOf(127);
    System.out.println(i11.equals(i22)); //why ?
    System.out.println(i11 == i22); //why ?

    /*EX 3 */
    Integer i111 = 128;
    Integer i222 = 128;
    System.out.println(i111.equals(i222)); //why ?
    System.out.println(i111 == i222); //why ?

  }
}